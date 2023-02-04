fun main(){
println("Programa que indique si un número es múltiplo de 6")
    println("Dame un numero:")
    val primerNumero: Int = readLine()!!.toInt()
    if (primerNumero%6 ==0){
        println("El $primerNumero es multiplo de 6")
    }
    if (primerNumero%6!=0){
        println("El $primerNumero es multiplo de 6")
    }
}