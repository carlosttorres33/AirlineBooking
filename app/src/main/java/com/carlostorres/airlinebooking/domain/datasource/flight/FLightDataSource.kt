package com.carlostorres.airlinebooking.domain.datasource.flight

import com.carlostorres.airlinebooking.domain.model.Flight

interface FLightDataSource {
    fun getFlights(): Map<Int, Flight>
}