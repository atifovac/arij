package com.arij.core.services.implementations

import com.arij.core.entities.Issue
import com.arij.core.entities.Label
import com.arij.core.entities.Ticket
import com.arij.core.repositories.IssueRepo
import com.arij.core.repositories.LabelRepo
import com.arij.core.repositories.TicketRepo
import com.arij.core.services.TicketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TicketServiceImpl : TicketService {

    @Autowired
    lateinit var ticketRepo: TicketRepo
    @Autowired
    lateinit var issueRepo: IssueRepo
    @Autowired
    lateinit var labelRepo: LabelRepo

    override fun getTicketList(): List<Ticket> {
        return ticketRepo.findAll().toList()
    }

    override fun newTicket(issue: Issue, storyPoints: Int, labels: Set<Label>): Int {
        return ticketRepo.save(Ticket(0, issue, storyPoints, labels)).id
    }

    override fun newTicket(ticket: Ticket): Int {
        return ticketRepo.save(ticket).id
    }

    override fun newTicket(issueCode: Int, storyPoints: Int, vararg label: String): Int {
        val labels = labelRepo.findAll(label.asIterable()).toHashSet()
        val issue = issueRepo.findOne(issueCode)

        return ticketRepo.save(Ticket(0, issue, storyPoints, labels)).id
    }

    override fun deleteTicket(id: Int): Boolean {
        ticketRepo.delete(id)

        return ticketRepo.exists(id)
    }
}
