fun main() {
    val word = readlnOrNull() ?: ""

    val size = word.length
    val vocales = StringBuilder()

    for (i in 0 until size) {
        when (word[i]) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U','Y','y' -> vocales.append(word[i])
        }
    }

    println(vocales.toString())
}
