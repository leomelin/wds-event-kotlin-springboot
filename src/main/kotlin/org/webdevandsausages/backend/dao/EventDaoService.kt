package org.webdevandsausages.backend.dao

import meta.tables.Event
import meta.tables.Participant
import meta.tables.daos.EventDao
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
            .newMapper(object : TypeReference<Pair<meta.tables.pojos.Event, List<meta.tables.pojos.Participant>>>() {})

        return jdbcMapper.stream(resultSet).map { EventDto(it.first, it.second) }
            .collect(Collectors.toList())
    }
}