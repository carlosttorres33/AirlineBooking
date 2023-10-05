package com.carlostorres.airlinebooking.domain.usecases.ticket

import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource
import com.carlostorres.airlinebooking.domain.model.Ticket
import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage

class AssignBaggagePackToTicket(
    private val ticketDataSource: TicketDataSource
) {
    operator fun invoke(baggagePackage: BaggagePackage): Ticket?{
        return  baggagePackage?.let {
            ticketDataSource.tickets.first().apply {
                this.baggagePackage = it
            }
        }
    }
}