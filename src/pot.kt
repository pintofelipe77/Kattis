import kotlin.math.pow

fun main(){
    var X = 0
    var pow = 0
    val number = readln().toInt()
    var n = ""
    var base = 0

    for (i in 1..number){
        n = readln()
        pow = n[n.length-1].digitToInt()

        base = n.dropLast(1).toInt()
        X += base.toDouble().pow(pow).toInt()
    }

    println(X)
}