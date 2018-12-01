package blackjack

import org.junit.Test
import kotlin.test.assertEquals

class CardTest {

    @Test
    fun t1 () {
        val card1 = Card(1,1)
        val card2 = Card(13,4)

        assertEquals(1, card1.value)
        assertEquals(1, card1.suit)

        assertEquals(13, card2.value)
        assertEquals(4, card2.suit)
    }
}