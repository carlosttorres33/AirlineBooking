package com.carlostorres.airlinebooking.domain.model

import androidx.compose.ui.text.rememberTextMeasurer
import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.seat.Seat
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import java.math.BigDecimal

class Ticket(

){
    lateinit var flight: Flight
    lateinit var passenger: Passenger
    lateinit var baggagePackage: BaggagePackage
    lateinit var seat: Seat
    val totalPrice: BigDecimal // = flight.price + baggagePackage.price + seat.price
        get(){
            return if (this::flight.isInitialized && this::baggagePackage.isInitialized && this::seat.isInitialized){
                flight.price + baggagePackage.price + seat.price
            } else {
                BigDecimal(0)
            }

        }
}
