fun main(){
    var number = readLine()!!.toInt()
    var numberInt = readln().split(" ").map{ it.toInt() }.sum()

    print("${numberInt/number}")

}