fun main() {

    narrate("Un héroe entra al Distrito Federal. ¿Cuál es su nombre?") { message ->
        "\u001b[33;1m$message\u001b[0m"
    }
    val heroName = readLine() ?: "Édgar"

    changeNarratorMood()
    narrate("$heroName llega al centro")
}//main

