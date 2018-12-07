package blackjack

import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals
import kotlin.test.fail

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
        assertEquals("Ace", card1.valueName)
        assertEquals("Ace of Spades", card1.name)
        assertEquals(1, card1.points)

        assertEquals(13, card2.value)
        assertEquals(4, card2.suit)
        assertEquals("King", card2.valueName)
        assertEquals("King of Diamonds", card2.name)
        assertEquals(10, card2.points)

        try {
            val card3 = Card(1,5)
            fail("Should never get here")
        } catch (e: IllegalArgumentException) {
            //good
        }

        try {
            val card3 = Card(14,1)
            fail("Should never get here")
        } catch (e: IllegalArgumentException) {
            //good
        }

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

        val r = 1..10
        println(r.contains(6))
        println(6 in r) // that's the same like contains
    }
}