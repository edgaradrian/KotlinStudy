private const val TAVERN_MASTER = "Bob"
private const val TAVERN_NAME = "Locura de $TAVERN_MASTER"

fun visitTavern() {
    narrate("$heroName entra a $TAVERN_NAME")

    val patrons= listOf("Edgar", "Adrián", "Astrid")

    val astridMessage = if (patrons.contains("Astrid")) {
        "$TAVERN_MASTER dice: Astrid está atrás jugando cartas"
    } else {
        "$TAVERN_MASTER dice: Astrid no está aquí."
    }

    println(astridMessage)

}//visitTavern