fun main(){
    println("Programa para calcular el residuo y cociente de un numeros entre otro ")
    println("Dame el divisor")
    val primerNumero: Int = readLine()!!.toInt()


    println("Dame el dividendo")
    val segundoNumero: Int = readLine()!!.toInt()

    val calcularElCociente: Int = primerNumero/segundoNumero

    val  calcularElResiduo: Int = primerNumero%segundoNumero

    println("El cociente es igual a :$calcularElCociente y el residuo es igual a :$calcularElResiduo")
    
}