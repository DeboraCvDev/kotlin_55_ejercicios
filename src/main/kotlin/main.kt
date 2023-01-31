fun main(){
println("Programa para calcular la suma de dos numeros enteros")
    println("Dame tu primer numero")
    val primerNumero: Int = readLine()!!.toInt()

    println("Dame tu segundo numero")
    val segundoNumero: Int = readLine()!!.toInt()

    val calcularSuma: Int = primerNumero+segundoNumero

    println("El resultado a la suma es: $calcularSuma")
}