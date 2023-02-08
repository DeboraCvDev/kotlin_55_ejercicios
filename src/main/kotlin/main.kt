fun main() {
    println("Peso ideal")
    println("Dame tu estatura y tu peso")
    val estatura: Int = readLine()!!.toInt()
    val peso: Int = readLine()!!.toInt()
    val pesoIdeal: Int =estatura-100
    if (peso>0 && estatura>0){
        if (peso>pesoIdeal){
            println("Sobre Peso!")
        }
    }
    if (peso==pesoIdeal){
        println("Peso ideal!")
    }
    if (peso<pesoIdeal){
        println("Peso Bajo!")
    } else {
        println("Error!")
    }
}