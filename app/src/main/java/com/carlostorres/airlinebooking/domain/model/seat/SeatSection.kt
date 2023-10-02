package com.carlostorres.airlinebooking.domain.model.seat

import java.math.BigDecimal

data class SeatSection(
    val seatClass: SeatClass,
    val seats: Array<Seat>,
    val price: BigDecimal
)
