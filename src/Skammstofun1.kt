fun main() {
    val numberTheWord = readln().toInt()
    val inputLine = readln()

    val words = inputLine.split(" ")

    val upperCaseLetters = mutableListOf<Char>()

    for (word in words) {
        for (char in word) {
            if (char.isUpperCase()) {
                upperCaseLetters.add(char)
                break
            }
        }
    }
    println(upperCaseLetters.joinToString(""))
}
