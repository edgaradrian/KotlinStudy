import javax.swing.text.StyledEditorKit.BoldAction

const val heroName = "addick"
var playerLevel = 5

fun main(args: Array<String>) {
    println("$heroName starts the game")

    println(heroName)
    println(playerLevel)

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
) = when (playerLevel) {
        1 -> "Inicia la aventura."
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
        else -> "Tiene la espada encantada."
}//obtainQuest

private fun readBountyBoard() {
    println("$heroName lee las recompensas")
    println(obtainQuest(playerLevel = playerLevel, canAskForHelp = true))
}//readBountyBoard
