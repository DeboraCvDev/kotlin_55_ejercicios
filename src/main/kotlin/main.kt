fun main() {
    println("Programa que calcule el porcentaje:")
    println("Introduce la cantida:")
    val cantidad: Int = readLine()!!.toInt()
    println("Introduce porcentaje:")
    val porcentaje: Int = readLine()!!.toInt()
    val calcularPorcentaje: Int = cantidad*porcentaje
    println("El porcentaje es $calcularPorcentaje")
}