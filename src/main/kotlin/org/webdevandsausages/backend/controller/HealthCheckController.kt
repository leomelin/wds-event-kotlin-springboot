package org.webdevandsausages.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/utils")
class HealthCheckController {
    @GetMapping("/health")
    fun healthCheck(): String {
        return "OK"
    }
}