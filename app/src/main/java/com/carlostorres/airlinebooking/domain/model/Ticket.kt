package com.carlostorres.airlinebooking.domain.model

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.seat.Seat
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import java.math.BigDecimal

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggagePackage: BaggagePackage,
    val seat: Seat,
    val totalPrice: BigDecimal = flight.price + baggagePackage.price + seat.price
)
