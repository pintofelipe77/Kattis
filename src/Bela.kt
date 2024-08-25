fun main() {
    var total = 0

    val (hand, n) = readln().split(" ")
    val dominantSuit = n[0]
    val hands = hand.toInt() * 4

    repeat(hands) {
        val card = readln()
        val number = card[0]
        val suit = card[1]

        total += when (number) {
            'A' -> 11
            'K' -> 4
            'Q' -> 3
            'J' -> if (suit == dominantSuit) 20 else 2
            'T' -> 10
            '9' -> if (suit == dominantSuit) 14 else 0
            '8' -> 0
            '7' -> 0
            else -> 0
        }
    }

    println(total)
}
