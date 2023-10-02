package com.carlostorres.airlinebooking.domain.model.baggage.type

class BigHand() : BaggageType (){
    override val emoji: String = super.emoji + super.emoji
    override val tittle: String = "Big Hand Baggage"
    override val quantity: Int = 2
}
