package com.example.app03.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorldController {
    @GetMapping
    fun getHelloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello, World from app03 Kotlin Spring Boot")
    }
}
