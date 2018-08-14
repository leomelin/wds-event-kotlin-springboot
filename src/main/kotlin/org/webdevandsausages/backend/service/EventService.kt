package org.webdevandsausages.backend.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.webdevandsausages.backend.dao.EventDaoService
import org.webdevandsausages.backend.dto.EventDto

@Service
class EventService {
    @Autowired
    lateinit var eventDaoService: EventDaoService

    fun fetch(): List<EventDto> {
        return eventDaoService.findAllWithParticipants()
    }
}