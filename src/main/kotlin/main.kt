fun main() {
    println("Programa que indique el mayor numero:")
    println("Dame los numeros")
    val primerNumero: Int = readLine()!!.toInt()
    val segundoNumero: Int = readLine()!!.toInt()
    val tercerNumero: Int = readLine()!!.toInt()
    val cuartoNumero: Int = readLine()!!.toInt()
    if (primerNumero > segundoNumero && primerNumero > tercerNumero && primerNumero > cuartoNumero) {
        println("El mayor numero es:$primerNumero")
    }
    if (segundoNumero > primerNumero && segundoNumero > tercerNumero && segundoNumero > cuartoNumero) {
        println("El mayor numero es:$segundoNumero")
    }
    if (tercerNumero > primerNumero && tercerNumero > segundoNumero && tercerNumero > cuartoNumero) {
        println("El mayor numero es: $tercerNumero")
    }
    if (cuartoNumero > primerNumero && cuartoNumero > segundoNumero && cuartoNumero > tercerNumero) {
        println("El mayor numero es: $cuartoNumero")
    }
}