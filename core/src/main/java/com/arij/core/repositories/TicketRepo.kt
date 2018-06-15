package com.arij.core.repositories

import com.arij.core.entities.Ticket

@Deprecated("Use it until a database is available")
data class TicketRepo(val tickets: MutableList<Ticket>)
