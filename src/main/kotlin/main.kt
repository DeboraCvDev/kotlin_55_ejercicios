const val PI=3.1416
fun main(){

println("Programa que calcule el área y perímetro de un circulo")
println("Dame el Radio:")
   val radio = readLine()!!.toInt()
    val perimetro = radio * 2 * PI
    val area = radio * 2 * PI

    println("el area es $area y el perimetro $perimetro ")
}