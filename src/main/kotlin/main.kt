fun main() {
    println("Programa que calcule areas de figuras")
    println("Opciones:")
    println("1.Cuadrado")
    println("2.Rectangulo")
    println("3.Triangulo")
    println("4.Salir")
    val valorIngresado:Int = readLine()!!.toInt()
    println("Ingrese la primera medida:")
    val primeraMedida: Int = readLine()!!.toInt()
    println("Ingrese la segunda medida:")
    val segundaMedida: Int = readLine()!!.toInt()
    when(valorIngresado){
        1->{
            println("El área del cuadrado es: $primeraMedida x $segundaMedida :")
            println("Es-->${primeraMedida*segundaMedida} ")
        }
        2->{
            println("El área del rectangulo es: $primeraMedida x $segundaMedida :")
            println("Es-->${primeraMedida*segundaMedida} ")
        }
        3->{
            println("El área del triangulo es: $primeraMedida x $segundaMedida / 2:")
            println("Es-->${primeraMedida*segundaMedida/2} ")
        }
       4->{
           println("Fin del programa")

       }

    }
}