package com.arij.core.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleRestController {

    @GetMapping("/hello")
    fun hello(@RequestParam(value="name", defaultValue = "World") name: String): String {
        return "Hello, $name!"
    }

}
