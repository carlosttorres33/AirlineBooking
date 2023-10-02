package com.carlostorres.airlinebooking.domain.model

import com.carlostorres.airlinebooking.domain.model.seat.Seat

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggagePackage: BaggagePackage,
    val seat: Seat
)
