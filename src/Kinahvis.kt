fun main(){
    val word1 = readln()
    val word2 = readln()
    var people = 1

    for(i in 0 until word1.length){
        if(word1[i] != word2[i]) {
            people++
        }
    }
    println("$people")
}