package org.webdevandsausages.backend.dao

import meta.tables.Event
import meta.tables.Participant
import meta.tables.daos.EventDao
import org.jooq.DSLContext
import org.jooq.impl.DSL.using
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.webdevandsausages.backend.dto.EventDto
import java.util.*
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
        val resultMap = using(configuration())
            .select().from(Event.EVENT).join(Participant.PARTICIPANT)
            .on(Event.EVENT.ID.eq(Participant.PARTICIPANT.EVENT_ID)).fetchMap (
                // Map every row to Pojos
                { r ->
                    r.into(Event.EVENT).into(meta.tables.pojos.Event::class.java)
                },
                { r ->
                    r.into(Participant.PARTICIPANT).into(meta.tables.pojos.Participant::class.java)
                })

        return resultMap.entries.fold(mutableListOf(), { acc, entry ->
            val eventDto = acc.find { Objects.equals(it.event.id, entry.key.id) }
            if (eventDto != null)
                eventDto.participants = eventDto.participants.plus(entry.value)
            else
                acc.add(
                    EventDto(
                        entry.key,
                        listOf(entry.value)
                    )
                )
            return@fold acc
        })
    }
}