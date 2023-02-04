fun main() {
    println("programa que indique si un número es divisible entre dos y cinco (a la vez)")
    println("Dame el numero:")
    val primerNumero: Int = readLine()!!.toInt()
    if (primerNumero % 5 == 0 && primerNumero % 2 != 0) {
        println("El numero $primerNumero es divisible entre 2 y 5")
    } else {
        println("El numero $primerNumero no es divisible entre 2 y 5")
    }
}