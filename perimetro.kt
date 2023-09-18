/*PROGRAMACION MOVIL*/
/*Garcia Arellano Daritza Guadalupe 6NM61*/

import kotlin.math.PI //libreria

/*Declaracion de PI*/
const val pi = PI

fun main(){
    
    /*1. Para un número decimal, ¿Qué tipo de dato se asigna por defecto?*/
    println("R= Double.\n")

    /*2. Volver flotante a la variable decimal */  
    println("R= Al final del numero asignado en variable se coloca f por ejemplo: 'valorX = 1.87f'.\n")

    /*3. Declarar una variable const val con el valor de PI y multiplicarla por 2 veces nuestra variable decimal 
     para sacar el perímetro de un círculo*/
    
    val perimetro= 2 * pi
    
    println("El perímetro del círculo es: $perimetro")
}
