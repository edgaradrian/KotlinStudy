fun main() {

    narrate("Un héroe entra al Distrito Federal. ¿Cuál es su nombre?") { message ->
        "\u001b[33;1m$message\u001b[0m"
    }
    val heroName = readLine()
    require(heroName != null && heroName.isNotEmpty()) {
        "El héroe debe tener un nombre"
    }

    changeNarratorMood()
    narrate("$heroName llega al centro")
}//main

