fun main(){

    var (r1,c1) = readln().split(" ").map { it.toInt() }
    var (r2,c2) = readln().split(" ").map { it.toInt() }

    var m = 0

    if(r1 == r2 || c1 == c2){
        m = 1
    }else{
        m = 2
    }

    println("$m")

}