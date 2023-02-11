fun main() {
    println("Programa que realiza operaciones aritmeticas:")
    println("Opciones: ")
    println("1.Suma:")
    println("2.Resta:")
    println("3.Multiplicación:")
    println("4.División")
    println("5.Potenciación")
    println("6. Salir")
    val valorIngresado: Int = readLine()!!.toInt()
    when (valorIngresado) {
        1 -> Sumar()
        2 -> Restar()
        3 -> Multiplicar()
        4 -> Dividir()
        5 -> Potenciar()
        6 -> mostrarError()
    }
}

fun Sumar() {
    println("Suma:")
    println("Dame los numeros:")
    val primerNumero = readLine()!!.toInt()
    val segundoNumero: Int = readLine()!!.toInt()
    val calcularSuma: Int = primerNumero + segundoNumero
    println("La suma de es igual a: $calcularSuma")
}

fun Restar() {
    println("Resta:")
    println("Dame los numeros:")
    val tercerNumero: Int = readLine()!!.toInt()
    val cuartoNumero: Int = readLine()!!.toInt()
    val calcularResta: Int = tercerNumero - cuartoNumero
    println("La resta es igual a $calcularResta")
}

fun Multiplicar() {
    println("Multiplicar:")
    println("Dame los numero:")
    val quintoNumero: Int = readLine()!!.toInt()
    val sextoNumero: Int = readLine()!!.toInt()
    val calcularMultiplicación: Int = quintoNumero * sextoNumero
    println("La multiplicación es igual a $calcularMultiplicación")
}

fun Dividir() {
    println("Dividir:")
    println("Dame los numeros:")
    val septimoNumero: Int = readLine()!!.toInt()
    val octavoNumero: Int = readLine()!!.toInt()
    val calcularDivisión: Int = septimoNumero / octavoNumero
    println("La división es igual a $calcularDivisión")
}

fun Potenciar() {
    println("Potenciar:")
    println("Dame los numeros:")
    val novenoNumero: Int = readLine()!!.toInt()
    val decimoNumero: Int = readLine()!!.toInt()
    //Esta operacion permite calcula la potencia de 2 numeros
    val potenciar: Double = Math.pow(novenoNumero.toDouble(), decimoNumero.toDouble())
    println("la potenciacion es igual a $potenciar")
}

fun mostrarError() {
    println("Error en opcion")
}

//Manera de Gerson
//fun main() {
//    println("Programa que realiza operaciones aritmeticas:")
//    println("Opciones: ")
//    println("1.Suma:")
//    println("2.Resta:")
//    println("3.Multiplicación:")
//    println("4.División")
//    println("5.Potenciación")
//    println("6. Salir")
//    val valorIngresado: Int = readLine()!!.toInt()
//    println("Ingrese primer Numero:")
//    val primerNumero: Int = readLine()!!.toInt()
//    println("Ingrese Segundo Numero:")
//    val segundoNumero: Int = readLine()!!.toInt()
//    when (valorIngresado) {
//        1 -> {
//            println("La suma de $primerNumero + $segundoNumero :")
//            println("Es-->${primerNumero + segundoNumero}  ")
//        }
//
//        2 -> {
//            println("La resta de $primerNumero - $segundoNumero :")
//            println("Es-->${primerNumero - segundoNumero}  ")
//        }
//
//        3 -> {
//            println("La multiplicacion de $primerNumero x $segundoNumero :")
//            println("Es-->${primerNumero * segundoNumero}  ")
//        }
//
//        4 -> {
//            println("La division de $primerNumero / $segundoNumero :")
//            println("Es-->${primerNumero / segundoNumero}  ")
//        }
//
//        5 -> {
//            println("La potenciacion de $primerNumero / $segundoNumero :")
//            println("Es-->${primerNumero / segundoNumero}  ")
//        }
//
//        6 -> {
//            println("La division de $primerNumero / $segundoNumero :")
//            println("Es-->${(primerNumero * primerNumero) + (segundoNumero * segundoNumero)}  ")
//        }
//    }
//}
