package com.carlostorres.airlinebooking.presentation.baggage

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BaggagePackage
import com.carlostorres.airlinebooking.domain.model.baggage.type.BaggageType
import com.carlostorres.airlinebooking.domain.presentation.Formatter

class BaggagePackageConsole(
    private val baggageType: Formatter<BaggageType>
) : Formatter<BaggagePackage> {
    override fun format(t: BaggagePackage): String {
        return """
            ${t.name}
            ${baggageType.format(t.baggageTypes).trim()}
            Boarding Turn: ${t.boardingTurn.name}
            Price: $${t.price}

        """.trimIndent()
    }
}