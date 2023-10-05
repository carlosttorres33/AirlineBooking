package com.carlostorres.airlinebooking.data.airport

import com.carlostorres.airlinebooking.domain.datasource.airport.AirportDataSource
import com.carlostorres.airlinebooking.domain.model.Airport

class AirportLocalSource : AirportDataSource {
    override fun getAirports(): List<Airport> = listOf(
        Airport("QMX","Mexico City"),
        Airport("CHI","Chicago"),
        Airport("BOG","Bogota"),
        Airport("CUN","Cancun"),
        Airport("CHP","Chiapas")
    )
}