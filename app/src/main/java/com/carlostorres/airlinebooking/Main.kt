import android.net.vcn.VcnCellUnderlyingNetworkTemplate
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.Regular
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.RegularBasic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.regular.RegularClassic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub.ClubBasic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub.ClubClassic
import com.carlostorres.airlinebooking.domain.model.baggage.pack.vclub.VClub
import java.math.BigDecimal

fun main() {
    val basicPrice = BigDecimal(200)
    val classicPrice = BigDecimal(400)

    val clubBasicClub: VClub = ClubBasic(basicPrice)
    val clubClassicClub: VClub = ClubClassic(classicPrice)

    println(clubBasicClub.name)
    println(clubBasicClub.price)

    println(clubClassicClub.name)
    println(clubClassicClub.price)

    val basic: Regular = RegularBasic(basicPrice)
    val classic: Regular = RegularClassic(classicPrice)

    println(basic.name)
    println(basic.price)

    println(classic.name)
    println(classic.price)

}
