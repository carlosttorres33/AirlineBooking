package com.carlostorres.airlinebooking.domain.usecases.flight.di

import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.data.aircraft.AircraftLocalSource
import com.carlostorres.airlinebooking.data.airport.AirportLocalSource
import com.carlostorres.airlinebooking.data.airportbook.AirportBookingLocalSource
import com.carlostorres.airlinebooking.data.flight.FlightLocalSource
import com.carlostorres.airlinebooking.domain.datasource.flight.FLightDataSource


@RequiresApi(Build.VERSION_CODES.O)
class FlightDataDi {

    fun providesFlighsData(): FLightDataSource{

        val airportDataSource = AirportLocalSource()
        val airportBookingLocalSource = AirportBookingLocalSource(airportDataSource)
        val aircraftLocalSource = AircraftLocalSource()

        return FlightLocalSource(
            aircraftLocalSource, airportBookingLocalSource
        )

    }

}