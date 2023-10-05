package com.carlostorres.airlinebooking.domain.usecases.baggage

import com.carlostorres.airlinebooking.domain.datasource.baggage.BaggagePackageDataSource
import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage

class GetBaggagePackage(
    private val baggagePackageDataSource: BaggagePackageDataSource
) {
    operator fun invoke(): Map<Int, BaggagePackage>{
        return  baggagePackageDataSource.getBaggagePacks()
    }
}