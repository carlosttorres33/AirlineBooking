package com.carlostorres.airlinebooking.domain.usecases.seat

import com.carlostorres.airlinebooking.domain.model.seat.SeatSection
import com.carlostorres.airlinebooking.domain.usecases.flight.GetFlightSaved

class GetSeatsSection (
    private val getFlightSaved: GetFlightSaved
){

    operator fun invoke(): Map<Int, SeatSection>{
        val flight = getFlightSaved()
        return flight.airCraft.seatSections.mapIndexed{index, seatSection ->
            index + 1 to seatSection
        }.toMap()
    }
}