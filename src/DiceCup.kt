fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val counts = IntArray(n + m + 1) // Array to count sums from 2 to n+m
    for (i in 1..n) {
        for (j in 1..m) {
            counts[i + j]++
        }
    }

    val maxCount = counts.maxOrNull() ?: 0

    for (sum in 2..n + m) {
        if (counts[sum] == maxCount) {
            println(sum)
        }
    }
}
