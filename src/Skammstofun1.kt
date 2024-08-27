fun skammstofun(words: String): String {
    var abbreviation = ""

    for (word in words.split(" ")) {
        if (word[0].isUpperCase()) {
            abbreviation += word[0]
        }
    }

    return abbreviation
}

fun main() {
    val n = readLine()!!.toInt()
    val words = readLine()!!


    val abbreviation = skammstofun(words)
    println(abbreviation)
}
