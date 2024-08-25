fun main() {
    while (true) {
        try {
            val (a, b) = readLine()!!.split(" ").map { it.toLong() }
            val difference = Math.abs(a - b)
            println(difference)
        } catch (e: Exception) {
            break
        }
    }
}
