package com.carlostorres.airlinebooking.presentation.ticket

import com.carlostorres.airlinebooking.domain.model.Ticket
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import com.carlostorres.airlinebooking.presentation.PresentationFactory
import com.carlostorres.airlinebooking.presentation.PresentationFormat
import com.carlostorres.airlinebooking.presentation.ticket.format.TicketConsoleFormat

class TicketPresentationFactory : PresentationFactory<Ticket> {
    override fun getPresentationFormat(format: PresentationFormat): Formatter<Ticket> {

        return TicketConsoleFormat()

    }
}