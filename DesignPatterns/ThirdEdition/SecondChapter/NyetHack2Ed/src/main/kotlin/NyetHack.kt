fun main() {

    narrate("Un héroe entra al Distrito Federal. ¿Cuál es su nombre?")
    val heroName = readLine() ?: "Édgar"

    changeNarratorMood()
    narrate("$heroName llega al centro")
}//main

