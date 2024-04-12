import javax.swing.text.StyledEditorKit.BoldAction

const val heroName = "addick"
var playerLevel = 0

fun main(args: Array<String>) {
    println("$heroName starts the game")
    println("¿Qué nivel tiene $heroName? ")
    val playerLevelInput = readLine()!!
    playerLevel = if (playerLevelInput.matches("""\d+""".toRegex())) {
        playerLevelInput.toInt()
    } else {
        1
    }

    println("$heroName tiene el nivel $playerLevel")

    readBountyBoard()

    println("El tiempo pasa")
    println("$heroName regresa por su búsqueda")
    playerLevel += 1
    println(playerLevel)

    readBountyBoard()
}//main

private fun obtainQuest(
    playerLevel: Int,
    canAskForHelp: Boolean,
    hasFriends: Boolean = false,
    hasNewFriends: Boolean = false
): String? = when (playerLevel) {
        1 -> "It's Time Atxion"
        in 2..5 ->
            if (canAskForHelp) {
                if (hasFriends) {
                    "Pide ayuda a tus amigos para defender al pueblo de la invasión"
                } else if (hasNewFriends) {
                    "También pide ayuda a sus nuevos amigos"
                } else {
                    "Tendrá que enfrentar los peligros solo"
                }
            } else {
                "Salva al pueblo de las invasiones."
            }

        6 -> "Encuentra la espada encantada"
        7 -> "Busca el artefacto de la creación"
        else -> null
}//obtainQuest

private fun readBountyBoard() {

    val quest: String? = obtainQuest(playerLevel = playerLevel, canAskForHelp = true)
    val message: String = quest?.replace("Atxion", "xxxxxx")?.let { censoredQuest ->
        """
        |$heroName lee las recompensas
        | "$censoredQuest"
        """.trimMargin()
    } ?: "$heroName lee las recompensas pero no hay"

    println(message)
}//readBountyBoard
