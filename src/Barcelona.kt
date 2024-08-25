fun main() {

    val (n, b) = readLine()!!.split(" ").map { it.toInt() }
    val bags = readLine()!!.split(" ").map { it.toInt() }


    val benniBagIndex = bags.indexOf(b)


    when (benniBagIndex) {
        0 -> println("fyrst")
        1 -> println("naestfyrst")
        else -> println("${benniBagIndex+1} fyrst")
    }
}

