import javax.swing.text.StyledEditorKit.BoldAction

const val heroName = "addick"
var playerLevel = 0

fun main(args: Array<String>) {
    println("$heroName starts the game")
    println("¿Qué nivel tiene $heroName? ")
    playerLevel = readLine()?.toIntOrNull() ?: 0

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
): String? {
    require(playerLevel > 0) {
        "El nivel del jugador debe ser al menos 1."
    }

    return when (playerLevel) {
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
}

private fun readBountyBoard() {

    val message: String = try {
        val quest: String? = obtainQuest(playerLevel = playerLevel, canAskForHelp = true)
        quest?.replace("Atxion", "xxxxxx")?.let { censoredQuest ->
            """
        |$heroName lee las recompensas
        | "$censoredQuest"
        """.trimMargin()
        } ?: "$heroName lee las recompensas pero no hay"

    } catch (e: Exception) {
        "$heroName no puede leer las recompensas"
    }

    println(message)
}//readBountyBoard

class InvalidPlayerLevelException() :
        IllegalArgumentException("El nivel del jugador debe ser al menos 1.")