import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.domain.model.Flight
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import com.carlostorres.airlinebooking.domain.usecases.GetFlights
import com.carlostorres.airlinebooking.presentation.PresentationFormat
import com.carlostorres.airlinebooking.presentation.flight.FlightPresentationFactory

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    val presentationFormat = PresentationFormat.CONSOLE
    val flightFormat: Formatter<Flight> = FlightPresentationFactory().getPresentationFormat(presentationFormat)
    val flights = GetFlights(flightFormat).invoke()
    println(flights)

}

