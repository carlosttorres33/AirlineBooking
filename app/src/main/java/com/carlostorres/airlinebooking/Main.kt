import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.model.AirCraft
import com.carlostorres.airlinebooking.domain.model.Airport
import com.carlostorres.airlinebooking.domain.model.AirportBooking
import com.carlostorres.airlinebooking.domain.model.Flight
import com.carlostorres.airlinebooking.domain.model.Passenger
import com.carlostorres.airlinebooking.domain.model.Ticket
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.RegularBasic
import com.carlostorres.airlinebooking.domain.model.seat.Seat
import com.carlostorres.airlinebooking.domain.model.seat.SeatClass
import com.carlostorres.airlinebooking.domain.model.seat.SeatStatus
import com.carlostorres.airlinebooking.domain.usecases.GetFlights
import com.carlostorres.airlinebooking.presentation.flight.FlightConsoleFormat
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    val getFlights = GetFlights(FlightConsoleFormat())
    val flightFormat = getFlights.invoke()
    println(flightFormat)

}

