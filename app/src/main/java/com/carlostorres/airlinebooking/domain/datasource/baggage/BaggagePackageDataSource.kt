package com.carlostorres.airlinebooking.domain.datasource.baggage

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage

interface BaggagePackageDataSource {
    fun getBaggagePacks() : Map<Int, BaggagePackage>
}