package com.carlostorres.airlinebooking.data.ticket

import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource
import com.carlostorres.airlinebooking.domain.model.Ticket

class TicketListSingleton : TicketDataSource {

    companion object{
        private val tickets = mutableListOf(
            Ticket()
        )
    }

    override val tickets: List<Ticket> = TicketListSingleton.tickets
}