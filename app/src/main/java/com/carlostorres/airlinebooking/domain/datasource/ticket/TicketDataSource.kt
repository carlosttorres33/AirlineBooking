package com.carlostorres.airlinebooking.domain.datasource.ticket

import com.carlostorres.airlinebooking.domain.model.Ticket

interface TicketDataSource {

    val tickets: List<Ticket>

}