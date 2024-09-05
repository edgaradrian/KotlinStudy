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

    val otherMessage = if (patrons.containsAll(listOf("Edgar", "Adrián"))) {
        "$TAVERN_MASTER dice: Edgar y Adrián están sentados en la barra."
    } else {
        "$TAVERN_MASTER dice: Edgar y Adrián no están juntos ahora."
    }

    println(otherMessage)

}//visitTavern