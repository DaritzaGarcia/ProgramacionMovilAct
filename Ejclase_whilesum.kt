/*6NM61 GARCIA ARELLANO DARITZA GUADALUPE EJ EN CLASE WHILE SUMA*/

var numero = 1
var suma = 0

while (numero <= 10) {
    if (numero % 2 == 0) {
        suma += numero
    }
    numero++
}

println("La suma de números pares del 1 al 10 es: $suma")
