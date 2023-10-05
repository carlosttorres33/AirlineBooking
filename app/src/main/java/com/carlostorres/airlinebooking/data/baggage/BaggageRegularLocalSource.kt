package com.carlostorres.airlinebooking.data.baggage

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.RegularBasic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.RegularClassic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.RegularPlus

class BaggageRegularLocalSource : BaggagePackageLocalSource() {
    override fun getBaggagePacks(): Map<Int, BaggagePackage> {
        return mapOf(
            1 to RegularBasic(price),
            1 to RegularClassic(price),
            1 to RegularPlus(price)
        )
    }
}