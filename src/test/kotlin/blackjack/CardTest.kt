package blackjack

import org.junit.Test
import kotlin.test.assertEquals

class CardTest {

    @Test
    fun t1() {
        /*
        val card1 = Card(1,1) name parameters and change order like below
        val card2 = Card(13,4)
        */
        val card1 = Card(value = 1, suit = 1)
        val card2 = Card(value = 13, suit = 4)

        assertEquals(1, card1.value)
        assertEquals(1, card1.suit)
        assertEquals("Spades", card1.suitName)

        assertEquals(13, card2.value)
        assertEquals(4, card2.suit)
        assertEquals("Diamonds", card2.suitName)
    }

    @Test
    fun t2() {
        val x = if (3 < 4) "test1" else "test2"

        val suit = 2
        val y = when (suit) {
            1 -> "Spades"
            2 -> "Hearts"
            else -> "Wrong"
        }

        println("x = ${x}")
        println("y = ${y}")
    }
}