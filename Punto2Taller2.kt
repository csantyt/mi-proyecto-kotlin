fun main() {
    val num = listOf(10, 20, 30, 40, 50)
    val prom = calProm(num)
    println("El promedio es: $prom")
}

fun calProm(num: List<Int>): Double {
    if (num.isEmpty()) return 0.0
    return num.average()
}