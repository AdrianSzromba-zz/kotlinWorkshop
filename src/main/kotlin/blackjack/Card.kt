package blackjack

class Card(val value: Int, val suit: Int) {

    val suitName: String get() = "Spades" //Shortcut to create getter if there is onle line return statement

    val valueName: String get() {
            return "Ace"
        }
}