package blackjack

import java.lang.IllegalStateException

class Card(val value: Int, val suit: Int) {

    //    val suitName: String get() = "Spades" //Shortcut to create getter if there is onle line return statement
    val suitName: String
        get() = when (suit) { //works like switch in java
            1 -> "Spades"
            2 -> "Hearts"
            3 -> "Clubs"
            4 -> "Diamonds"
            else -> throw IllegalStateException
        }

    val valueName: String
        get() {
            return "Ace"
        }
}