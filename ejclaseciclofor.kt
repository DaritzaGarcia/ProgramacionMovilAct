/*6NM61 GARCIA ARELLANO DARITZA GUADALUPE EJ EN CLASE CICLO FOR*/
fun main() {
    val nombres = listOf(
        "Gabriela",
        "Noble 6",
        "Kiara",
        "Elena",
        "Luna",
        "Lucero",
        "Daritza",
        "Lupita",
        "Juan"
    )
    for (nombre in nombres) {
        println(nombre)
        if (nombre == "Noble 6") {
            println("Personaje Encontrado!")
            break
        }
    }
}
