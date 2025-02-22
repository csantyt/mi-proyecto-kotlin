fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val estaOrdenada = verificarOrdenAscendente(numeros)
    
    if (estaOrdenada) {
        println("La lista esta ordenada de manera ascendente.")
    } else {
        println("La lista no esta ordenada de manera ascendente.")
    }
}

fun verificarOrdenAscendente(numeros: List<Int>): Boolean {
    return numeros == numeros.sorted()
}