package com.carlostorres.airlinebooking.presentation.baggage.types

import com.carlostorres.airlinebooking.domain.model.baggage.type.BaggageType
import com.carlostorres.airlinebooking.domain.presentation.Formatter

class BaggageTypesConsole : Formatter<BaggageType> {
    override fun format(t: BaggageType): String {
        return """
            ${t.emoji} ${t.quantity} ${t.tittle}
        """.trimIndent()
    }
}

