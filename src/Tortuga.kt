fun main() {
    // Leer la cantidad de casos de prueba
    val testCases = readLine()?.toIntOrNull() ?: return

    repeat(testCases) {
        // Leer la secuencia de población de tortugas y convertirla a una lista de enteros
        val sequence = readLine()?.split(" ")?.map { it.toInt() } ?: return@repeat

        var importedTurtles = 0

        // Iterar sobre la secuencia para calcular la cota inferior de tortugas importadas
        for (i in 1 until sequence.size - 1) { // Nos detenemos antes del 0 final
            val current = sequence[i]
            val previous = sequence[i - 1]

            if (current > 2 * previous) {
                importedTurtles += current - 2 * previous
            }
        }

        // Imprimir el resultado para el caso de prueba actual
        println(importedTurtles)
    }
}
