fun main() {
    println("Escribir un programa que sume la serie 3,6,9 hasta 99 y despliegue su resultado")

    var I = 3
    var A = 0
    while (I <= 99){
        println("$I")
        A += I
        I += 3
    }
    println("La suma de los numeros es: $A")
}
