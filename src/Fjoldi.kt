fun main(){
    var text = readln()
    showOnlyLetter(text)
}

fun showOnlyLetter(text:String){

    val regex = Regex("[a-zA-Z]")
    var count = regex.findAll(text).count()
    println("$count")

}