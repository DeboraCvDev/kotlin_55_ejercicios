fun main() {
    println("Programa que calcule el cambio que debe darse a un cliente")
    println("Dinero entregado por el cliente:")
    val dinero: Int = readLine()!!.toInt()
    println("Costo del producto:")
    val costo: Int = readLine()!!.toInt()
    if (dinero>=costo){
        val m: Int = dinero-costo
        println("El cambio es:$m")
    }else{
        val f: Int = costo-dinero
      println("Te falta $f, no puedes hacer la compra")
    }
}