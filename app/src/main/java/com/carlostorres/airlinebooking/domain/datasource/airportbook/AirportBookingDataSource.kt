package com.carlostorres.airlinebooking.domain.datasource.airportbook

import com.carlostorres.airlinebooking.domain.model.AirportBooking

interface AirportBookingDataSource {

    fun getAirBookingPairs(): List<Pair<AirportBooking, AirportBooking>>

}