/**
 6NM61 GARCIA ARELLANO DARITZA GUADALUPE EJERCICIO EN CLASE PROMEDIO
 Crear una funcion que entregue el promedio de tres calificaciones. 
 * Este debe recibir dos parametros con calificaciones por defecto 8 y el tercer parametro no debe venir definido*/

fun calPromedio(calificacion1: Int = 8, calificacion2: Int = 8, calificacion3: Int? = null): Double {
    val canCali = if (calificacion3 != null) 3 else 2
    val sumaCalificaciones = calificacion1 + calificacion2 + (calificacion3 ?: 0)
    return sumaCalificaciones.toDouble() / canCali
}

fun main() {
    val promedio1 = calPromedio() // Usará los valores por defecto (8, 8, null)
    val promedio2 = calPromedio(7) // Usará 7 como tercer parámetro (8, 8, 7)
    val promedio3 = calPromedio(6, 9, 5) // Usará los valores proporcionados (6, 9, 5)

    println("Promedio 1: $promedio1")
    println("Promedio 2: $promedio2")
    println("Promedio 3: $promedio3")
}
