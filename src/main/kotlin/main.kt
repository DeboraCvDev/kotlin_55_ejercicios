fun main() {
    println("Escribir un programa que verifica si un dato ingresado por teclado corresponde a la contraseña 252525")
    println("Ingresa la cantraseña: ")
    val contraseña: Int = readLine()!!.toInt()
    if (contraseña == 252525){
       println("La contraseña es correcta")
    }
   else{
       println("La contraseña es Incorrecta! ")
    }
}
