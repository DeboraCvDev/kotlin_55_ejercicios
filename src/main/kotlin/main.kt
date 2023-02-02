fun main(){
    println("Programa que calcule el cuadrado de un numero")
    println("Dame el numero")
    val numero: Int= readLine()!!.toInt()


    val calcularElCuadradoDeUnNumero: Int = numero*numero
    println("El cuadrado de $numero es $calcularElCuadradoDeUnNumero")
}