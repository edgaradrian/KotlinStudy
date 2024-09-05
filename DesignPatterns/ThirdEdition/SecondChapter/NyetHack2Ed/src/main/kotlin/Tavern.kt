private const val TAVERN_MASTER = "Bob"
private const val TAVERN_NAME = "Locura de $TAVERN_MASTER"

fun visitTavern() {
    narrate("$heroName entra a $TAVERN_NAME")

    val patrons= listOf("Edgar", "Adrián", "Astrid")
    println(patrons[0])

}//visitTavern