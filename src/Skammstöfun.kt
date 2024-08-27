fun main(){
    val numberTheWord = readln().toInt()
    val regex = Regex("[A-Z]")
    val word = readln()
    val words = word.split(" ").filter { it.isNotEmpty() }


    val output = words.mapNotNull {
        word -> regex.find(word)?.value
    }.joinToString("")

    println("$output")

}
