fun main() {
    println("programa que indique si la suma de dos valores es positiva, negativa o cero")
    println("Dame los numeros:")
    val primerNumero: Int = readLine()!!.toInt()
    val segundoNumero: Int = readLine()!!.toInt()
    val suma: Int =primerNumero+segundoNumero
    if (suma>0){
        println("La suma $suma es positiva")
    }
    if (suma<0){
        println("La suma $suma es negativa")
    }
    if (suma==0){
        println("La suma $suma es igual a 0")
    }
}