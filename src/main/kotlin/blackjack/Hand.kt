package blackjack

class Hand(val name: String) {

    private val cards = mutableListOf<Card>() // in this class 'name' have default public accesor

    fun add(card: Card) {
        cards.add(card)
    }

}