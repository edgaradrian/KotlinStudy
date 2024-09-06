import java.io.File

private const val TAVERN_MASTER = "Bob"
private const val TAVERN_NAME = "Locura de $TAVERN_MASTER"

private val menuData = File("data/tavern-menu-data.txt")
    .readText()
    .split("\n")

private val menuItems = List(menuData.size) { index ->
    val (_, name, _) = menuData[index].split(",")
    name
}

fun visitTavern() {
    narrate("$heroName entra a $TAVERN_NAME")
    narrate("Hay diferentes artículos a la venta:")
    println(menuItems)

    val patrons= mutableListOf("Edgar", "Adrián", "Astrid")

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

    patrons.forEachIndexed { index, patron ->
        println("Buenas noches, $patron eres el #${index + 1} en la fila")
        placeOrder(patron, "la bebida del Dragón")
    }

}//visitTavern

private fun placeOrder(patronName: String, menuItemName: String) {
    narrate("$patronName habla con $TAVERN_MASTER para realizar un pedido")
    narrate("$TAVERN_MASTER entrega $menuItemName a $patronName ")
}//placeOrder