fun main(args: Array<String>) {
    //Tipos de variables

    //Mutables
    var mutables = 2


    //Inmutables
    val inmutables = 6

    //implementacion de los diferentes tipos
    mutables = 3

    //inmutables = 4

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

   /* Una duda, entonces especificarle el tipo a kotlin sería una mala practica?

   No siempre, hay veces en los que es necesario hacerlo, por ejemplo, cuando declaramos variables “globales” y queremos que desde el principio sean nulls o sean “nulleables” como lo siguiente

    var nombre = "Lisa"
    nombre = null//Esto tira error ya que nombre no puede ser null

/////////////////

    var nombre:String? = "Lisa"
    nombre = null//Esto si se puede por que ya especificaste el tipo de dato
    */

    //Tipos de datos
    /*
        Tipos de enteros:
    * Long—64 bit
    * Int—32 bit
    * Short—16 bit
    * Byte—8 bit

     Tipo flotante
    * Double—64 bit
    * Float—32 bit


    Tipo String
     String

     Tipo booleano
     Boolean

     */
    var n1 : Int = 0
    var n2 : Long = 23
    var n2_1 : Long = 2L
    var n2_2 = 34L
    var n3 : Float = 4f
    var n3_1 = 5.7
    var n4 : Double = 34.5
    var n4_1 = 3.6

    var n5 : Boolean = true
    var n6 = false



}