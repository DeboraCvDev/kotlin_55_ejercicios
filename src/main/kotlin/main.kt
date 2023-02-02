fun main(){
println("Programa que calcule el área y perímetro de un rectángulo")
    println("Dame la base")
 val base:Int= readLine()!!.toInt()

    println("Dame el perimetro")
 val perimetro:Int= readLine()!!.toInt()



    val calcularArea = base*perimetro

    val calcularPerimetro = 2*base+perimetro


    println("El área del rectángulo es: $calcularArea y el perímetro es: $calcularPerimetro")

}