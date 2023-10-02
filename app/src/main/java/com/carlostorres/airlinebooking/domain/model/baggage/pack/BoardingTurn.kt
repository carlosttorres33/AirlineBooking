package com.carlostorres.airlinebooking.domain.model.baggage.pack

enum class BoardingTurn(
    val message :String
) {
    FIRST("aborda Primero"),
    SECOND("Aborda Segundo"),
    THIRD("Aborda tercero"),
    END("Aborda al Final")
}