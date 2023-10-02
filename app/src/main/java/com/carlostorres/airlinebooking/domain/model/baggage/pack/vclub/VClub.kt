package com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.baggage.type.BaggageType
import com.carlostorres.airlinebooking.domain.model.baggage.type.BoxPacked
import java.math.BigDecimal

const val DISCOUNT = 30
open class VClub (
    override val name: String,
    final override var price: BigDecimal
): BaggagePackage() {

    init {
        price = (price * BigDecimal(DISCOUNT)) / BigDecimal(100)
    }

    override val baggageTypes: List<BaggageType>
        get() = super.baggageTypes + listOf(
            BoxPacked()
        )

}