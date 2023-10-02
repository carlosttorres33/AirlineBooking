package com.carlostorres.airlinebooking.domain.model

import com.carlostorres.airlinebooking.domain.model.seat.SeatSection

data class AirCraft(
    val name: String,
    val mode: String,
    val airline: Airline,
    val seatSections: Map<Int, SeatSection>
)
