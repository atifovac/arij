package com.arij.core.implementations

import com.arij.core.entities.Issue
import com.arij.core.entities.Label
import com.arij.core.entities.Ticket
import com.arij.core.repositories.IssueRepo
import com.arij.core.repositories.LabelRepo
import com.arij.core.repositories.TicketRepo
import com.arij.core.services.TicketService

class TicketServiceImpl : TicketService{
    val ticketRepo: TicketRepo = TicketRepo(mutableListOf())
    val labelRepo: LabelRepo = LabelRepo(mutableListOf())
    val issueRepo: IssueRepo = IssueRepo(mutableListOf())

    override fun getTicketList(): List<Ticket> {
        return ticketRepo.tickets
    }

    override fun newTicket(issue: Issue, storyPoints: Int, labels: List<Label>) : Int {
        val id = ticketRepo.tickets
                .map { ticket -> ticket.id }
                .max()?.plus(1) ?: 0

        ticketRepo.tickets.add(Ticket(id, issue, storyPoints, labels))

        return id
    }

    override fun newTicket(issueCode: Int, storyPoints: Int, vararg label: String): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteTicket(id: Int) : String {
        val selectedTicket = ticketRepo.tickets.filter { ticket -> ticket.id == id }.getOrNull(0)

        return if (selectedTicket != null) {
            ticketRepo.tickets.removeAt(
                    ticketRepo.tickets.indexOf(selectedTicket)
            )
            "Deleted"
        } else {
            "Not found"
        }
    }
}
