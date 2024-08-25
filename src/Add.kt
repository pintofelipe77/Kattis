fun main() {
    val N = readLine()!!.toInt()
    val K = readLine()!!.toInt()
    val S = readLine()!!.toInt()

    // Encuentra el menor número L >= N cuya suma de dígitos sea S
    val L = findMinNumber(N, S)

    // Encuentra el mayor número M <= K cuya suma de dígitos sea S
    val M = findMaxNumber(K, S)

    // Imprime los resultados
    println(L)
    println(M)
}

// Función para calcular la suma de los dígitos de un número
fun sumOfDigits(x: Int): Int {
    var sum = 0
    var num = x
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}

// Función para encontrar el menor número >= N cuya suma de dígitos sea S
fun findMinNumber(N: Int, S: Int): Int {
    var number = N
    while (sumOfDigits(number) != S) {
        number++
    }
    return number
}

// Función para encontrar el mayor número <= K cuya suma de dígitos sea S
fun findMaxNumber(K: Int, S: Int): Int {
    var number = K
    while (sumOfDigits(number) != S) {
        number--
    }
    return number
}
