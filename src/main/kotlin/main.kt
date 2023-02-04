fun main(){
println("Programa que indica si un numero es par o impar")
    println("Dame un numero:")
    val primerNumero: Int = readLine()!!.toInt()
    if (primerNumero%2==0){
        println("El numero $primerNumero es par")
    }
    else{
        println("El numero $primerNumero no es par")
    }
}