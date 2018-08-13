package com.arij.core.repositories

import com.arij.core.entities.Ticket
import org.springframework.data.repository.CrudRepository

interface TicketRepo : CrudRepository<Ticket, Int>
