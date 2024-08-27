import kotlin.math.pow

fun main(){
    val n = readLine()!!.toInt()
    var result = 0


    repeat(n){
        val number = readLine()!!
        val base = number.dropLast(1).toInt()
        val exponent = number.takeLast(1).toInt()
        result += base.toDouble().pow(exponent).toInt()

    }

    print(result)
}