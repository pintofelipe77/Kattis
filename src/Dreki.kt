fun main(){
    val  a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val x = (b*b)-4*a*c

    val numberOfRealRoot = when{
        x > 0 -> 2
        x == 0 -> 1
       else -> 0
    }

    println("$numberOfRealRoot")

}