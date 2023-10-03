package com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubPlus(
    price: BigDecimal
) : VClub(price) {

    override val name: String = "Plus"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST

}