package com.carlostorres.airlinebooking.domain.usecases.reservation

import com.carlostorres.airlinebooking.domain.datasource.reservation.ReservationDataSource
import com.carlostorres.airlinebooking.domain.model.Reservation
import com.carlostorres.airlinebooking.domain.model.Ticket

private const val CODE_SIZE = 5
class AssignTicketToReservation(
    private val reservationDataSource: ReservationDataSource
)
{

    operator fun invoke(ticket: List<Ticket>): Reservation{

        return reservationDataSource.reservation.apply {
            this.code = generateCode()
            this.departureTickets = ticket
            this.returnTickets = ticket
        }

    }

    private fun generateCode(): String {
        val allowerChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..CODE_SIZE).map {
            allowerChars.random()
        }.joinToString("")
    }

}