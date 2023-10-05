package com.carlostorres.airlinebooking.domain.usecases.ticket

import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource
import com.carlostorres.airlinebooking.domain.model.Flight
import com.carlostorres.airlinebooking.domain.model.Ticket

class AssignFlightToTicket (
    private val ticketDataSource: TicketDataSource
) {

    operator fun invoke(flight: Flight?): Ticket?{

        return flight?.let {
            ticketDataSource.tickets.first().apply {
                this.flight = it
            }
        }

    }

}