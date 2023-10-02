package com.carlostorres.airlinebooking.domain.model.seat

import java.math.BigDecimal

data class Seat(
    val number: String,
    val price: BigDecimal,
    val status: SeatStatus,
    val seatClass: SeatClass
)
