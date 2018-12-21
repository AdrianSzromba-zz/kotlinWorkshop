package blackjack

import org.junit.Test
import kotlin.test.assertEquals

class HandTest {

    @Test
    fun t1() {
        val h1 = Hand("Player")
        h1.add(Card(1,1))
        h1.add(Card(13,4))

        val h2 = Hand("Dealer")
        h2.add(Card(1,1))
        h2.add(Card(2,1))
        h2.add(Card(3,1))

        assertEquals("Player", h1.name)
        assertEquals(11, h1.points)
        assertEquals(2, h1.size)

        assertEquals("Dealer", h1.name)
        assertEquals(6, h2.points)
        assertEquals(3, h2.size)
    }
}