fun main(args: Array<String>) {
    var nombre = "Pedro jesus hincapie"

    val edad = 23

    println(nombre)

    //Esta esa la forma en la que normalmente se construyen textos
    val sentencia = "Mi nombre es " + nombre + "tengo la edad de " + edad

    //Pero en kotlin contamos con esta maravilla
    val sen = "Mi nombre es $nombre y tengo $edad años"

    print(sentencia)

    println(sen)

    //Ademas podemos realizar operaciones, como es el caso de {}
    val sent = "Mi edad el proximo años es de ${edad + 1}"

    println(sent)

    //Otro aporte sensacional en kotlin es el hecho de contar con forma sensacional de crear textos enorme

    val texto = """
       Pedro dentro de este texto, podemos almacenar una cantidad enorme de contenido
        Para ello tenemos esta pequeña demostracion.
    """

    print(texto)

    //Ademas tenemos la virtud de formatear el presente txto
    val text2 =
        """|Texto mas largo que el antetior tenemos::::::::::::::::::::::::::::::::::::::::::::::::::::::"
            |::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                |:::Estos texto se álinae
|::::::::::::::::::::::::::::::::::::::::::::::.
            """.trimMargin()

    println(text2)

    // Otra cosita si necesitas cambiar de codificacion tenemos
    val texr = """
        Addjdjdjdjdjhdhjh
        Ajaksjdkasjkjdjasjds
        Akladskdlaskdlsakdsak
        jkajskdjsdjskdj
        jhasdhashdslahk
        yhjehhqwjehqwehqw
    """.trimMargin(marginPrefix = "A")

    println(texr)









}