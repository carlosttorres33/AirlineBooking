package com.carlostorres.airlinebooking.domain.model

import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import java.math.BigDecimal
import java.time.Duration
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
data class Flight(
    val number: String,
    val airCraft: AirCraft,
    val price: BigDecimal,
    val departureArrivalBooking: Pair<AirportBooking, AirportBooking>,
    val duration: Duration = Duration.between(
        departureArrivalBooking.second.dateTime,
        departureArrivalBooking.first.dateTime
    )
)
