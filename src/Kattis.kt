fun main(){
    val input = readLine()

    val number = input?.toDoubleOrNull()

    if(number != null){
        val numberRounded = if(number-number.toInt() == 0.5){
            number.toInt()+1

        }else{
            kotlin.math.round(number).toInt()
        }
        println(numberRounded)
    }

}