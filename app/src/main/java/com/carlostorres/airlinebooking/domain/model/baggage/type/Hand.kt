package com.carlostorres.airlinebooking.domain.model.baggage.type

class Hand : BaggageType(){
    override val emoji: String = "\uD83D\uDC5C"
    override val tittle: String = "Hand Baggage"
    val warning: String = "Warning Message"
}
