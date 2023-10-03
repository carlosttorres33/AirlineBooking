package com.carlostorres.airlinebooking.domain.usecases

import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.model.AirCraft
import com.carlostorres.airlinebooking.domain.model.Airport
import com.carlostorres.airlinebooking.domain.model.AirportBooking
import com.carlostorres.airlinebooking.domain.model.Flight
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

@RequiresApi(Build.VERSION_CODES.O)
class GetFlights(
    private val formatter: Formatter<Flight>
) {

    fun invoke():String{

        val flight = Flight(
            number = "ABC123",
            airCraft = AirCraft("VivaAerobus", "jetpack"),
            price = BigDecimal(300.0),
            departureArrivalBooking = getAirportPair()
        )

        val flights= listOf(
            flight,
            flight,
            flight
        )

        return formatter.format(flights)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getAirportPair(): Pair<AirportBooking, AirportBooking>{
        return Pair(
            AirportBooking(
                airport = Airport("BOG", "Bogotá"),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 10,13,0,0
                )
            ),
            AirportBooking(
                airport = Airport("CUN", "Cancún"),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 10,17,30,0
                )
            )
        )
    }

}