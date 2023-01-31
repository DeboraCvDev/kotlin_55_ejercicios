fun main() {
    println("Programa para calcular el area y perimetro de un pentágono")
    println("Dame el lado")
    val lado: Int = readLine()!!.toInt()

    println("Dame la apotema")
    val apotema: Int = readLine()!!.toInt()




    val calcularArea = (lado * 5 * apotema/2)

    val calcularPerimetro: Int = lado*5

    println("El area del pentágono es: $calcularArea y el perímetro es: $calcularPerimetro")
}