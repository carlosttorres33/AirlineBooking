package com.carlostorres.airlinebooking.domain.model.baggage.pack.regular

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Basic(
    name: String,
    price: BigDecimal
) : Regular(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.END
}