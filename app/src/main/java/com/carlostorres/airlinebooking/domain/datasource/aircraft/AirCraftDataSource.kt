package com.carlostorres.airlinebooking.domain.datasource.aircraft

import com.carlostorres.airlinebooking.domain.model.AirCraft

interface AirCraftDataSource {

    fun getAirCrafts(): List<AirCraft>

}