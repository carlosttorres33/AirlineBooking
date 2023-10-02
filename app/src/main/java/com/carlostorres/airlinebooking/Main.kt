import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.carlostorres.airlinebooking.domain.model.baggage.type.Hand

fun main() {
    val hand = Hand()
    println(hand.quantity)
    println(hand.tittle)
    println(hand.warning)
    println(hand.emoji)
}
