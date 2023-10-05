package com.carlostorres.airlinebooking.domain.usecases.ticket

import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource
import com.carlostorres.airlinebooking.domain.model.Ticket
import com.carlostorres.airlinebooking.domain.model.seat.Seat

class AssignSeatToTicket(
    private val ticketDataSource: TicketDataSource
) {
    operator fun invoke(seat: Seat?): Ticket?{

        return seat?.let {
            ticketDataSource.tickets.first().apply {
                this.seat = it
            }
        }

    }
}