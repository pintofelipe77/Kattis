fun main() {
    var n:Int = readln().toInt()
    var array = mutableListOf<String>()
    var input = ""

    for (i in 1 ..  n){
        input = readLine().toString()

       when(input[0]){

           'k' -> array.add(input)
           'p' -> array.add(input)
           'w' -> array.add(input)
       }
    }

    searchWord(array)

}

fun searchWord(array: MutableList<String>){

    //keys, phone, or wallet
    var keys:Boolean = false
    var phone:Boolean = false
    var wallet:Boolean = false

    for (i in array){
        when (i){
            "keys" -> keys = true
            "phone" -> phone = true
            "wallet" -> wallet = true
        }
    }

    if (!keys){
     println("keys")
    }
    if (!phone){
        println("phone")
    }
    if(!wallet){
        println("wallet")
    }

    if(keys && phone && wallet){
        println("ready")
    }

}

