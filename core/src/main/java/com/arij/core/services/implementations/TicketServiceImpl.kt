package com.arij.core.services.implementations

import com.arij.core.entities.Issue
import com.arij.core.entities.Label
import com.arij.core.entities.Ticket
import com.arij.core.repositories.TicketRepo
import com.arij.core.services.TicketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TicketServiceImpl : TicketService {

    @Autowired
    lateinit var ticketRepo: TicketRepo

    override fun getTicketList(): List<Ticket> {
        return ticketRepo.findAll().toList()
    }

    override fun newTicket(issue: Issue, storyPoints: Int, labels: Set<Label>): Int {
        val id = ticketRepo.findAll()
                .map { ticket -> ticket.id }
                .max()?.plus(1) ?: 0

        ticketRepo.save(Ticket(id, issue, storyPoints, labels))

        return id
    }

    override fun newTicket(ticket: Ticket): Int {
        val id = ticketRepo.findAll()
                .map { storedTicket -> storedTicket.id }
                .max()?.plus(1) ?: 0

        ticket.id = id

        ticketRepo.save(ticket)

        return id
    }

    override fun newTicket(issueCode: Int, storyPoints: Int, vararg label: String): Int {
        //label = labelService.getLabelByName(label[0]);
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteTicket(id: Int): String {
        val selectedTicket = ticketRepo.findOne(id)

        return if (selectedTicket != null) {
            ticketRepo.delete(id)
            "Deleted"
        } else {
            "Not found"
        }
    }
}
