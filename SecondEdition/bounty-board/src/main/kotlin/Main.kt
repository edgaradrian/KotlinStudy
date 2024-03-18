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

    val quest: String = when (playerLevel) {
        1 -> "Inicia la aventura."
    in 2..5 ->
            if (canAskForHelp) {
                "Pide ayuda a tus amigos para defender al pueblo de la invasión"
            } else {
                "Salva al pueblo de las invasiones."
            }
     6 -> "Encuentra la espada encantada"
     7 -> "Busca el artefacto de la creación"
        else -> "Tiene la espada encantada."
    }

    println("El heroe lee las recompensas: ")
    println(quest)

    println("El tiempo pasa")
    println("El heroe regresa por su búsqueda")
    playerLevel += 1
    println(playerLevel)

}//main