fun main(){

    var size = readln().toInt()


    var output:String = ""
    var legal = 0
    var value:Int = 0
    var info = ""
    for(i in 1 ..  size){
        var (m,n) = readln().split(" ")
        value = n.toInt()
        if(value>legal){
            legal = value
            output = m
        }
    }

    println("$output")
}