package com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Basic(
    price: BigDecimal,
    name: String = "Bassic VClub"
) : VClub(name, price) {

    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD

}