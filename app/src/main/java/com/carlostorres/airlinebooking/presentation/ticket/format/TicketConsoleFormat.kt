package com.carlostorres.airlinebooking.presentation.ticket.format

import com.carlostorres.airlinebooking.domain.model.Ticket
import com.carlostorres.airlinebooking.domain.presentation.Formatter

class TicketConsoleFormat : Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            Passenger: ${t.passenger.name}
            Flight number: ${t.flight.number}
            Departure: ${t.flight.departureArrivalBooking.first.airport.name}
            Arrival: ${t.flight.departureArrivalBooking.second.airport.name}
            Flight Price: ${'$'}${t.flight.price}
            BaggagePlan: 
            Seat: ${t.seat.number}
            Total: ${'$'}${t.totalPrice}
        """.trimIndent()
    }

}