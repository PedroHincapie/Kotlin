//Funcion sin parametros
fun hello (): Unit {
    println("Esta es una funcion que hace el simil al void de java")
}

//function con parametros
fun suma (x: Int, y: Int): Int {
    return x + y
}

//funcion con el cuerpo como respuesta a la funcion
fun multiplicar (x: Int, u:Int) = x * u

//para cason de condiconales
fun max (x: Int, y: Int) = if (x >= y) x else y

fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    //LLamadas a las funciones
    hello()


    println(suma(2,7))


    println(multiplicar(3,5))

    println(max(4,9))
}