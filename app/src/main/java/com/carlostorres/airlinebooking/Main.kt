import android.os.Build
import androidx.annotation.RequiresApi
import com.carlostorres.airlinebooking.data.aircraft.AircraftLocalSource
import com.carlostorres.airlinebooking.data.airport.AirportLocalSource
import com.carlostorres.airlinebooking.data.airportbook.AirportBookingLocalSource
import com.carlostorres.airlinebooking.data.baggage.BaggageVClobLocalSource
import com.carlostorres.airlinebooking.data.flight.FlightLocalSource
import com.carlostorres.airlinebooking.data.ticket.TicketListSingleton
import com.carlostorres.airlinebooking.domain.model.Flight
import com.carlostorres.airlinebooking.domain.presentation.Formatter
import com.carlostorres.airlinebooking.domain.usecases.baggage.GetBaggagePackage
import com.carlostorres.airlinebooking.domain.usecases.flight.GetFlightSaved
import com.carlostorres.airlinebooking.domain.usecases.flight.GetFlights
import com.carlostorres.airlinebooking.domain.usecases.flight.di.FlightDataDi
import com.carlostorres.airlinebooking.domain.usecases.ticket.AssignFlightToTicket
import com.carlostorres.airlinebooking.domain.usecases.ticket.di.TicketDataDi
import com.carlostorres.airlinebooking.presentation.PresentationFormat
import com.carlostorres.airlinebooking.presentation.baggage.BaggagePackageConsole
import com.carlostorres.airlinebooking.presentation.baggage.types.BaggageTypesConsole
import com.carlostorres.airlinebooking.presentation.flight.FlightPresentationFactory
import com.carlostorres.airlinebooking.presentation.flight.format.FlightConsoleFormat
import java.time.Month

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    val ticketData = TicketDataDi().providesTicketsData()

    val getFlights = GetFlights(
        FlightDataDi().providesFlighsData()
    ).invoke(Month.JANUARY)


    var flightOptions = ""
    do{
        getFlights.forEach{ (t,u) ->

            print("$t. ")
            println(FlightConsoleFormat().format(u))

        }
        flightOptions = readLine().orEmpty()

        println("Slect number option")

        val isNumber = flightOptions.all { it.isDigit() }
        val isValidOption = isNumber && getFlights.containsKey(flightOptions.toInt())

    } while (flightOptions.isBlank() || flightOptions.isEmpty() || !isValidOption)

    println("Flight SELECTED: $flightOptions")

    val flight = getFlights[flightOptions.toInt()]
    AssignFlightToTicket(ticketData).invoke(flight)

    val flightSelected = GetFlightSaved(ticketData).invoke()
    println(
        FlightConsoleFormat().format(flightSelected)
    )


}

