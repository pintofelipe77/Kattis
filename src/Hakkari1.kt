import kotlin.math.min

fun main(){

    val (row,column) = readln().split(" ").map { it.toInt() }

    var cadena = mutableListOf<String>()
    var mina:Int = 0
    var fila = mutableListOf<Int>()
    var columna = mutableListOf<Int>()

    for (i in 0 until row){
        cadena.add(readln())
    }

    for(i in 0 until  row){
        for(j in 0 until  column){
            when(cadena[i][j]){
              '*' ->{
                  fila.add(i+1)
                  columna.add(j+1)
                  mina++

              }
            }

        }
    }

    println("$mina")
    for (i in 0 until mina){
        println("${fila[i]} ${columna[i]} \n")
    }


}