package org.webdevandsausages.backend.dao

import meta.tables.Event
import meta.tables.Participant
import meta.tables.daos.EventDao
import meta.tables.daos.ParticipantDao
import meta.tables.records.EventRecord
import meta.tables.records.ParticipantRecord
import org.jooq.DSLContext
import org.jooq.impl.DSL.using
import org.simpleflatmapper.jdbc.JdbcMapperFactory
import org.simpleflatmapper.util.TypeReference
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.webdevandsausages.backend.dto.EventDto
import java.util.stream.Collectors
import javax.annotation.PostConstruct


@Service
class EventDaoService : EventDao() {
    @Autowired
    lateinit var ctx: DSLContext

    @PostConstruct
    fun conf() {
        super.setConfiguration(ctx.configuration())
    }

    /**
     * Custom method with custom query + mapper
     */
    fun findAllWithParticipants(): List<EventDto> {
        val resultSet = using(configuration())
            .select().from(Event.EVENT).join(Participant.PARTICIPANT)
            .on(Event.EVENT.ID.eq(Participant.PARTICIPANT.EVENT_ID)).fetchResultSet()

        val jdbcMapper = JdbcMapperFactory
            .newInstance()
            .addKeys(Participant.PARTICIPANT.ID.name)
            .newMapper(object : TypeReference<Pair<EventRecord, List<ParticipantRecord>>>() {})

        val map = jdbcMapper.stream(resultSet).map {
            val result1 = using(configuration()).newResult(Event.EVENT)
            result1.add(it.first)

            val event = result1.map(EventDao().mapper())[0]

            val result2 = using(configuration()).newResult(Participant.PARTICIPANT)
            result2.addAll(it.second)

            val participants = result2.map(ParticipantDao().mapper())
            EventDto(event, participants)
        }.collect(Collectors.toList())

        return map
    }
}