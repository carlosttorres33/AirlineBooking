package com.carlostorres.airlinebooking.domain.model

import java.math.BigDecimal

data class BaggagePackage(
    val name: String,
    val price: BigDecimal,
    val personalQty: Int,
    val handQty: Int,
    val checkedQty: Int
)
