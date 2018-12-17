package blackjack

import org.junit.Test

class HandTest {

    @Test
    fun t1() {
        val h1 = Hand("Player")
        h1.add(Card(1,1))
        h1.add(Card(13,4))

        val h2 = Hand("Player")
        h2.add(Card(1,1))
        h2.add(Card(2,1))
        h2.add(Card(3,1))
    }
}