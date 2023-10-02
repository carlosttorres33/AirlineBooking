package com.carlostorres.airlinebooking.domain.model.baggage.pack.regular

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.baggage.type.BaggageType
import java.math.BigDecimal

open class Regular(
    override val name: String,
    override val price: BigDecimal
) : BaggagePackage() {
}