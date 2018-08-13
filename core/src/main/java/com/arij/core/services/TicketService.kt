package com.arij.core.services

import com.arij.core.entities.Issue
import com.arij.core.entities.Label
import com.arij.core.entities.Ticket

interface TicketService {
    fun getTicketList(): List<Ticket>

    fun newTicket(issue: Issue, storyPoints: Int, labels: Set<Label>) : Int

    fun newTicket(issueCode: Int, storyPoints: Int, vararg label: String) : Int

    fun newTicket(ticket: Ticket) : Int

    fun deleteTicket(id: Int) : String
}
