var heroName: String = ""

fun main() {

    heroName = promptHeroName()
    //changeNarratorMood()
    narrate("$heroName, ${createTitle(heroName)} llega al centro")
    visitTavern()
}//main

private fun promptHeroName(): String {
    narrate("Un heroe entra al DF. ¿Cuál es su nombre?") { message ->
        "\u001b[33;1m$message\u001b[0m"
    }

    /*val input = readLine()
    require(input != null && input.isNotEmpty()) {
        "El heroe debe tener un nombre"
    }

    return input*/

    println("Obi Wan")
    return "Obi Wan"

}//promptHeroName

private fun createTitle(name: String): String {
    return when {
        name.count() > 8 -> "El Verboso"
        name == name.reversed() -> "Portador de Palíndromos."
        name.all { it.isDigit() } -> "El Identificador"
        name.none { it.isLetter() } -> "Sin Letras"
        name.first().isUpperCase() -> "El llamativo"
        name.count { it.lowercase() in "aeiou" } > 4 -> "Maestro de las vocales"
        else -> "El héroe renombrado"
    }
}//createTitle

