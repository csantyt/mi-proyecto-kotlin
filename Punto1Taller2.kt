fun main() {
    val personas = listOf(
        Pair("Carlos", 25),
        Pair("Juan", 17),
        Pair("Pacho", 19),
        Pair("Felipe", 16),
        Pair("Dani", 30)
    )

    impMayores(personas)
}
un impMayores(personas: List<Pair<String, Int>>) {
    println("Personas mayores de edad:")
    for ((nombre, edad) in personas) {
        if (edad >= 18) {
            println("$nombre - $edad años")
        }
    }
}