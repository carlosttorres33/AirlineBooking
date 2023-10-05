package com.carlostorres.airlinebooking.domain.usecases.ticket.di

import com.carlostorres.airlinebooking.data.ticket.TicketListSingleton
import com.carlostorres.airlinebooking.domain.datasource.ticket.TicketDataSource

class TicketDataDi {
    fun providesTicketsData(): TicketDataSource{
        return TicketListSingleton()
    }
}