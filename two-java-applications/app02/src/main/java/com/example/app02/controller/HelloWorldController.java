package com.example.app02.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        var a = 1;
        var b = 2;
        return ResponseEntity.ok("Hello World from app02 Java Spring Boot!!!");
    }
}
