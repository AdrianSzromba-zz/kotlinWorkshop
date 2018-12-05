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
            else -> throw IllegalStateException()
        }

    val valueName: String
        get() = when (value) {
            1 -> "Ace"
            in 2..10 -> value.toString()
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> throw IllegalStateException()
        }

    val name get() = "$valueName of $suitName" //by $ sign, variable is part of function

    val points:Int get() = when(value) {
        in 1..9 -> value
        in 10..13 -> 10
        else -> throw IllegalStateException()
    }

}