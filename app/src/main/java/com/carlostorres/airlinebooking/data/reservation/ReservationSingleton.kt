package com.carlostorres.airlinebooking.data.reservation

import com.carlostorres.airlinebooking.domain.datasource.reservation.ReservationDataSource
import com.carlostorres.airlinebooking.domain.model.Reservation

class ReservationSingleton: ReservationDataSource {

    companion object{
        private val reservation = Reservation()
    }

    override val reservation: Reservation = ReservationSingleton.reservation
}