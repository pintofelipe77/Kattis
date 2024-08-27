fun main(){
    val word = readlnOrNull() ?: ""
    val vocales = setOf('a', 'e', 'i', 'o', 'u','y','Y', 'A', 'E', 'I', 'O', 'U')

    val resultado = word.filter { it in vocales }

    println(resultado)
}