import kotlin.math.min

fun main() {

    val (row,column) = readln().split(" ").map { it.toInt() }

    var matriz = Array(row){ arrayOfNulls<String>(column)}
    //var matrizPosition = ArrayList<Int>()
    var char:String
    var fila = mutableListOf<Int>()
    var columna = mutableListOf<Int>()
    var mina = 0

    for (i in 1..row) {
        for (j in 1..column) {
            println("$i + $j")
            matriz[i-1][j-1] = readln()
        }
    }

    for (i in 1..row) {
        for (j in 1..column) {

            when(matriz[i-1][j-1]) {
                "*" -> {
                    fila.add(i)
                    columna.add(j)
                    mina++
                }
            }
        }
    }

    println("${mina}")
    for (i in 0 until mina) {
        println("${fila[i]} ${columna[i]} \n")
    }
}