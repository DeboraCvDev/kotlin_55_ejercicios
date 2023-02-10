fun main() {
    println("Programa para determinar si un angulo es agudo u obtuso")
    println("Dame un angulo:")
    val primerAngulo: Int = readLine()!!.toInt()
    if (primerAngulo >= 0) {
        if (primerAngulo < 90) {
            println("Angulo agudo")
        }
    }
    if (primerAngulo > 90) {
        println("Angulo obtuso")
    }

}