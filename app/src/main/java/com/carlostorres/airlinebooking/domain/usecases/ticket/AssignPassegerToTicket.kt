package com.carlostorres.airlinebooking.domain.usecases.ticket

import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource
import com.carlostorres.airlinebooking.domain.model.Passenger
import com.carlostorres.airlinebooking.domain.model.Ticket

class AssignPassegerToTicket(
    private val ticketDataSource: TicketDataSource
) {
    operator fun invoke(passenger: Passenger): Ticket? {
        return  ticketDataSource.tickets.first().apply {
            this.passenger = passenger
        }
    }
}