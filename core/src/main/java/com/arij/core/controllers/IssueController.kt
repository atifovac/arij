package com.arij.core.controllers

import com.arij.core.entities.Issue
import com.arij.core.entities.Ticket
import com.arij.core.services.IssueService
import com.arij.core.services.TicketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("issue")
class IssueController @Autowired constructor(private val service: IssueService) {


    @GetMapping("/")
    fun getTicketList(): List<Issue> {
        return service.getIssueList()
    }

    /*@PostMapping("/new")
    fun newTicket(issue: Issue, storyPoints: Int, labels: List<Label>) : Int {
        return service.newTicket(issue, storyPoints, labels)
    }*/

    @PostMapping("/new")
    fun newTicket(@RequestBody(required = true) issue: Issue): Int {
        return service.newIssue(issue)
    }

    @PostMapping("/newWithParams")
    fun newTicket(@RequestParam(required = true) issueCode: Int,
                  @RequestParam(required = true) message: String) : Int {
        return service.newIssue(issueCode, message)
    }

    @DeleteMapping("/{code}")
    fun deleteTicket(@RequestParam(value = "code") code: Int): Boolean {
        return service.deleteIssue(code)
    }
}
