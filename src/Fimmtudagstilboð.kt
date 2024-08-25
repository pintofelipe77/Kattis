fun main() {

    val priceBase = 1000
    var year = 2020
    var total = 0
    var yearUser = readLine()!!.toInt()

    if (yearUser <= year) {
        println("$priceBase")
    }else {
        total = yearUser - year

        total *= 100
        total += priceBase
        println("$total")
    }

}