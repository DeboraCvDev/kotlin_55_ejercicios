fun calcularGrandePequeñoMedio(cantidadDeNumeros: Int){
    var i = 0
    var o = 0
    var p: Int = 0
    var g: Int = 0
    var m: Int = 0
    var a: Int = 0
    if (cantidadDeNumeros > 0){
    do {
        println("Ingrese un numero:")
        val numero = readLine()!!.toInt()
        if (i == 0){
            p = numero
            g = numero
        }
        if (numero < p){
            p = numero
        }
        if (numero > g){
            g = numero
        }
        i = i + 1
        a = a + numero
    }while (i < cantidadDeNumeros)

    m = a / cantidadDeNumeros
        println("Mayor $g Menor $p Medio $m")
    }else {
        print("Error..")
    }
}