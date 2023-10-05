package com.carlostorres.airlinebooking.domain.datasource.airport

import com.carlostorres.airlinebooking.domain.model.Airport

interface AirportDataSource {

    fun getAirports(): List<Airport>

}