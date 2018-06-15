package com.arij.core.controllers

import com.arij.core.entities.Issue
import com.arij.core.entities.Label
import com.arij.core.entities.Ticket
import com.arij.core.services.TicketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController("/ticket")
abstract class TicketController @Autowired constructor(private val service: TicketService){


    @GetMapping("/")
    fun getTicketList() : List<Ticket> {
        return service.getTicketList()
    }

    @PostMapping("/new")
    fun newTicket(issue: Issue, storyPoints: Int, labels: List<Label>) : Int {
        return service.newTicket(issue, storyPoints, labels)
    }

    @DeleteMapping("/")
    fun deleteTicket(@RequestParam(value = "id") id: Int) : String {
        return service.deleteTicket(id)
    }
}
