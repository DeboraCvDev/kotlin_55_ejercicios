fun main() {
    println("Programa que despliegue el día de la semana dado un número de día")
    println("Dame el día:")
    val dia: Int = readLine()!!.toInt()
    if (dia == 1) {
        println("Lunes")
    }
    if (dia == 2) {
        println("Martes")
    }
    if (dia == 3) {
        println("Miercoles")
    }
    if (dia == 4) {
        println("Jueves")
    }
    if (dia == 5) {
        println("Viernes")
    }
    if (dia == 6) {
        println("Sabado")
    }
    if (dia == 7) {
        println("Domingo")
    }else{
        println("Error!")
    }
}