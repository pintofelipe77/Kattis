import java.awt.Color

class Coche(var color: String, var weight: Int ){



    constructor(color: String) : this(color, 1500){

    }

    constructor():this("black",1700)


    var long:Int = 2
    var width:Double = 0.5
    var height:Double = 0.9

    fun accelerate(){
        println("I am accelerating the coche!")
    }

    fun brake(){
        println("I am brake")
    }

    fun turn(){
        println("I am turn!")
    }

}

fun main() {

    val cocheOne = Coche("blue",1500)
    val cocheTwo = Coche("orange",500)
    val cocheThree = Coche("purple",1300)
    val cocheFour = Coche("yellow",1800)
    val cocheFive = Coche("red",2000)

    val cocheSix = Coche()

    cocheOne.accelerate()
    println("the color the coche is ${cocheOne.color} and your weight is ${cocheOne.weight}")
    println("the weight of the cocheSix is ${cocheSix.weight} and your color is ${cocheSix.color}")

}