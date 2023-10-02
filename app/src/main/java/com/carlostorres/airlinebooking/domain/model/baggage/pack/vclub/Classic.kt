package com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub

import com.carlostorres.airlinebooking.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Classic(
    price: BigDecimal,
    name: String = "Classic VClub"
) : VClub(name, price) {

    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND

}