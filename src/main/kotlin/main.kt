fun main() {
    println("Programa que calcule el área y perímetro de un rectángulo")
    println("Dame la base:")
    val base: Int = readLine()!!.toInt()

    println("Dame el Altura:")
    val altura: Int = readLine()!!.toInt()

    val calcularArea = base * altura

    val calcularPerimetro = 2 * base + altura

    println("El área del rectángulo es: $calcularArea y el perímetro es: $calcularPerimetro")

}