package com.carlostorres.airlinebooking.domain.datasource.reservation

import com.carlostorres.airlinebooking.domain.model.Reservation

interface ReservationDataSource {
    val reservation: Reservation
}