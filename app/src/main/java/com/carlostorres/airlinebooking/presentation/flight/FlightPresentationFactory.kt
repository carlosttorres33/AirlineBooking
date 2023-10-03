package com.carlostorres.airlinebooking.presentation.flight

import com.carlostorres.airlinebooking.domain.model.Flight
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import com.carlostorres.airlinebooking.presentation.PresentationFactory
import com.carlostorres.airlinebooking.presentation.PresentationFormat
import com.carlostorres.airlinebooking.presentation.flight.format.FlightConsoleFormat
import com.carlostorres.airlinebooking.presentation.flight.format.FlightHTMLFormat

class FlightPresentationFactory : PresentationFactory<Flight> {

    override fun getPresentationFormat(format: PresentationFormat): Formatter<Flight> {

        return when (format) {

            PresentationFormat.CONSOLE -> FlightConsoleFormat()

            PresentationFormat.HTML -> FlightHTMLFormat()

            else -> FlightConsoleFormat()

        }

    }

}