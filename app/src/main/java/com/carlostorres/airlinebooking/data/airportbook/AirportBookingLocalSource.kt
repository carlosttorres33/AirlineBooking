package com.carlostorres.airlinebooking.data.airportbook

import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.datasource.airport.AirportDataSource
import com.carlostorres.airlinebooking.domain.datasource.airportbook.AirportBookingDataSource
import com.carlostorres.airlinebooking.domain.model.Airport
import com.carlostorres.airlinebooking.domain.model.AirportBooking
import java.time.LocalDateTime
import java.time.Month

@RequiresApi(Build.VERSION_CODES.O)
class AirportBookingLocalSource(
    private  val airportDataSource: AirportDataSource
) : AirportBookingDataSource {

    override fun getAirBookingPairs(): List<Pair<AirportBooking, AirportBooking>> {
        return listOf(
            Pair(
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.JANUARY, 10,13,0,0
                    )
                ),
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.JANUARY, 10,17,30,0
                    )
                )
            ),
            Pair(
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.JANUARY, 10,13,0,0
                    )
                ),
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.JANUARY, 10,17,30,0
                    )
                )
            ),
            Pair(
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.FEBRUARY, 20, 11, 40, 0
                    )
                ),
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.FEBRUARY, 20, 14, 20, 0
                    )
                )
            ),
            Pair(
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.MARCH, 15, 15, 30, 0
                    )
                ),
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.MARCH, 15, 18, 0, 0
                    )
                )
            ),
            Pair(
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.MARCH, 22, 16, 0, 0
                    )
                ),
                AirportBooking(
                    airport = airportDataSource.getAirports().random(),
                    dateTime = LocalDateTime.of(
                        2023, Month.MARCH, 22, 18, 0, 0
                    )
                )
            )
        )
    }
}