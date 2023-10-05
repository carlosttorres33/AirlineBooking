package com.carlostorres.airlinebooking.domain.usecases.flight

import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource
import com.carlostorres.airlinebooking.domain.model.Flight

class GetFlightSaved (
    private val ticketDataSource: TicketDataSource
){
    operator fun invoke(): Flight{

        return ticketDataSource.tickets.first().flight

    }
}