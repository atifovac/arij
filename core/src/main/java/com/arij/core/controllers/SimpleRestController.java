package com.arij.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
