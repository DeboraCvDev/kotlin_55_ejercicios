import kotlin.math.*

fun main() {
    println("Programa que calcule la hipotenusa de un triangulo rectangulo")
    println("¿Cuanto mide el primer cateto?")
    val primerCateto: Int = readLine()!!.toInt()
    println("¿Cuanto mide el segundo cateto?")
    val segundoCateto: Int = readLine()!!.toInt()
    val calcularHipotenusa: Int =
        sqrt((primerCateto.toDouble() * primerCateto) * (segundoCateto * segundoCateto)).toInt()
    println(La hipotenusa es:"$calcularHipotenusa")
}