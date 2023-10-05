package com.carlostorres.airlinebooking.data.aircraft

import com.carlostorres.airlinebooking.domain.datasource.aircraft.AirCraftDataSource
import com.carlostorres.airlinebooking.domain.model.AirCraft
import com.carlostorres.airlinebooking.domain.model.seat.Seat
import com.carlostorres.airlinebooking.domain.model.seat.SeatClass
import com.carlostorres.airlinebooking.domain.model.seat.SeatSection
import java.math.BigDecimal

class AircraftLocalSource : AirCraftDataSource {

    override fun getAirCrafts(): List<AirCraft> = listOf(
        AirCraft("Airbus", "1233", getSeatSections()),
        AirCraft("Airbus", "1233", getSeatSections()),
        AirCraft("Airbus", "1233", getSeatSections())
    )

    private fun getSeatSections(): List<SeatSection>{
        return listOf(
            SeatSection(
                seatClass = SeatClass.BUSINESS,
                seats = arrayOf(
                    Seat("1", BigDecimal(30), SeatClass.BUSINESS),
                    Seat("2", BigDecimal(30), SeatClass.BUSINESS),
                    Seat("3", BigDecimal(30), SeatClass.BUSINESS)
                ),
                price = BigDecimal(30)
            ),
            SeatSection(
                seatClass = SeatClass.PLUS,
                seats = arrayOf(
                    Seat("4", BigDecimal(20), SeatClass.PLUS),
                    Seat("5", BigDecimal(20), SeatClass.PLUS),
                    Seat("6", BigDecimal(20), SeatClass.PLUS)
                ),
                price = BigDecimal(20)
            ),
            SeatSection(
                seatClass = SeatClass.ECONOMY,
                seats = arrayOf(
                    Seat("7", BigDecimal(10), SeatClass.ECONOMY),
                    Seat("8", BigDecimal(10), SeatClass.ECONOMY),
                    Seat("9", BigDecimal(10), SeatClass.ECONOMY)
                ),
                price = BigDecimal(10)
            )
        )

    }

}