package org.webdevandsausages.backend.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.webdevandsausages.backend.dto.EventDto
import org.webdevandsausages.backend.service.EventService


@RestController
@RequestMapping("/api/event")
class EventController {

    @Autowired
    lateinit var eventService: EventService

    @GetMapping
    fun getEvents(): List<EventDto> {
        return eventService.fetch()
    }
}