fun main() {
    println("Calcule el mas grande, el mas pequeño y la media de N numeros.")
    println("Ingrese la cantidad de numeros:")
    var cantidadDeNumeros: Int = readLine()!!.toInt()
    calcularGrandePequeñoMedio(cantidadDeNumeros)
}