package com.carlostorres.airlinebooking.domain.model.baggage.pack.regular

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.baggage.pack.BoardingTurn
import com.carlostorres.airlinebooking.domain.model.baggage.type.BaggageType
import java.math.BigDecimal

abstract class Regular(
    override val price: BigDecimal
) : BaggagePackage() {

    abstract override val name: String
    abstract override val boardingTurn: BoardingTurn

}