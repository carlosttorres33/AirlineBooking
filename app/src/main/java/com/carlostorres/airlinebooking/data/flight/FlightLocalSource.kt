package com.carlostorres.airlinebooking.data.flight

import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.datasource.aircraft.AirCraftDataSource
import com.carlostorres.airlinebooking.domain.datasource.airportbook.AirportBookingDataSource
import com.carlostorres.airlinebooking.domain.datasource.flight.FLightDataSource
import com.carlostorres.airlinebooking.domain.model.Flight
import java.math.BigDecimal

@RequiresApi(Build.VERSION_CODES.O)
class FlightLocalSource(
    private val aircraftDataSource: AirCraftDataSource,
    private val airportBookingDataSource: AirportBookingDataSource

) : FLightDataSource {
    override fun getFlights(): Map<Int, Flight> = mapOf(
        1 to Flight(
            number = "Y4 708",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(100.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random(),
        ),
        2 to Flight(
            number = "Y4 905",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(130.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        ),
        3 to Flight(
            number = "Y4 748",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(110.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        ),
        4 to Flight(
            number = "Y4 819",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(100.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        ),
        5 to Flight(
            number = "Y4 5478",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(90.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        ),
        6 to Flight(
            number = "Y4 901",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(90.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        ),
        7 to Flight(
            number = "Y4 858",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(150.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        ),
        8 to Flight(
            number = "Y4 806",
            airCraft = aircraftDataSource.getAirCrafts().random(),
            price = BigDecimal(60.0),
            departureArrivalBooking = airportBookingDataSource.getAirBookingPairs().random()
        )
    )
}