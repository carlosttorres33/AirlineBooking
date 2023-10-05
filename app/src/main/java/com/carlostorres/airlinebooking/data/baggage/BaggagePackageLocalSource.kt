package com.carlostorres.airlinebooking.data.baggage

import com.carlostorres.airlinebooking.domain.datasource.baggage.BaggagePackageDataSource
import java.math.BigDecimal

abstract class BaggagePackageLocalSource : BaggagePackageDataSource {

    val price: BigDecimal = BigDecimal(50)

}