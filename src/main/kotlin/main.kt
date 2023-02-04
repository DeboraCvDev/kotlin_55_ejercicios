fun main(){
println("Programa que indique si un numero es divisible entre 14")
    println("Dame el numero:")
    val primerNumero: Int = readLine()!!.toInt()
    if (primerNumero/14==0){
        println("El numero $primerNumero si es divisible entre 14")
    }
    if (primerNumero/14!=0){
        println("El numero $primerNumero no es divisble entre 14")
    }
}