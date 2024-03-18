const val heroName = "addick"
fun main(args: Array<String>) {
    println("The hero starts the game")

    println(heroName)

    var playerLevel = 5
    println(playerLevel)

    val hasFriends = true
    val hasNewFriends = false
    val playerClass = "terran"
    val canAskForHelp = hasFriends && (!hasNewFriends || playerClass == "terran")

    if (playerLevel == 1) {
        println("Inicia la aventura.")
    } else if (playerLevel <= 5) {
        val quest: String = if (canAskForHelp) {
            "Pide ayuda a tus amigos para defender al pueblo de la invasión"
        } else {
            "Salva al pueblo de las invasiones."
        }
        println(quest)
    } else if (playerLevel == 6) {
        println("Encuentra la espada encantada")
    } else if (playerLevel == 7) {
        println("Busca el artefacto de la creación")
    } else {
        println("Tiene la espada encantada.")
    }

    println("El tiempo pasa")
    println("El heroe regresa por su búsqueda")
    playerLevel += 1
    println(playerLevel)

}//main