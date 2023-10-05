package com.carlostorres.airlinebooking.domain.usecases.flight

import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.datasource.flight.FLightDataSource
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
    private val fLightDataSource: FLightDataSource
) {

    operator fun invoke(month: Month): Map<Int, Flight> {

        return fLightDataSource
            .getFlights()
            .filter { flightEntry ->
                flightEntry.value.departureArrivalBooking.first.dateTime.month == month
            }

    }

}