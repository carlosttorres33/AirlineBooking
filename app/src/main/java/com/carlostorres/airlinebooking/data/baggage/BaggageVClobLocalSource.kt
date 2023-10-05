package com.carlostorres.airlinebooking.data.baggage

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub.ClubBasic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub.ClubClassic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub.ClubPlus

class BaggageVClobLocalSource : BaggagePackageLocalSource() {
    override fun getBaggagePacks(): Map<Int, BaggagePackage> {
        return mapOf(
            1 to ClubBasic(price),
            2 to ClubClassic(price),
            3 to ClubPlus(price)
        )
    }
}