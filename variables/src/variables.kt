fun main(args: Array<String>) {
    //Tipos de variables

    //Mutables
    var mutables = 2


    //Inmutables
    val inmutables = 6

    //implementacion de los diferentes tipos
    mutables = 3

    inmutables = 4

    print(mutables + inmutables)

    /*
    Dentro de Kotlin, podemos tipar o no las varibales.

    Por ser inteligente este, se auto infiere y determina el tipo de dato que se esta
     utilizando en una de sus variable.
     */

    // ejemplo
    var nombre = "Pedro"

    var apellido : String = "Hincapie"

    //para el caso en que requieras convertiri un String to Int

    var numero = 3

    numero = "8".toInt()

    print(numero)

}