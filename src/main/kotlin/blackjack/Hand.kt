package blackjack

class Hand(val name: String) {

    private val cards = mutableListOf<Card>() // in this class 'name' have default public accesor
    val size get() = cards.size
    val points: Int
        get() {
            var t = 0
            for (c in cards) t += c.points
            return t
        }
//    second method
//    val points: Int
//        get() {
//            var t = 0
//            cards.forEach({t += it.points})
//            return t
//        }

    fun add(card: Card) {
        cards.add(card)
    }

}