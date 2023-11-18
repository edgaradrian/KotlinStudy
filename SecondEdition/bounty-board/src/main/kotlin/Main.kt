const val heroName = "addick"
fun main(args: Array<String>) {
    println("The hero starts the game")

    println(heroName)

    var playerLevel = 1
    println(playerLevel)

    if (playerLevel == 1) {
        println("Inicia la aventura.")
    } else {
        println("Tiene la espada encantada.")
    }

    println("El tiempo pasa")
    println("El heroe regresa por su búsqueda")
    playerLevel += 1
    println(playerLevel)

}//main