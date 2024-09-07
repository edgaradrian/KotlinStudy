import java.io.File

private const val TAVERN_MASTER = "Bob"
private const val TAVERN_NAME = "Locura de $TAVERN_MASTER"

private val firstNames = setOf("Edgar", "Adrián", "Astrid", "Abril")
private val lastNames = setOf("Ruiz", "Miranda", "Infante", "Skywalker")

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
    //narrate(menuItems.toString())
    narrate(fancyMenuLook())

    val patrons: MutableSet<String> = mutableSetOf()

    while(patrons.size < 10) {
        patrons += "${firstNames.random()} ${lastNames.random()}"
    }

    narrate("$heroName ve a varios clientes en la taverna $TAVERN_NAME:")
    narrate(patrons.joinToString())

    repeat(3) {
        placeOrder(patrons.random(), menuItems.random())
    }

}//visitTavern

private fun placeOrder(patronName: String, menuItemName: String) {
    narrate("$patronName habla con $TAVERN_MASTER para realizar un pedido")
    narrate("$TAVERN_MASTER entrega $menuItemName a $patronName ")
}//placeOrder

private fun fancyMenuLook(): String {
    var menu = "\n*** Bienvenidos a $TAVERN_NAME *** \n"

    val map = menuData.map { it.split(",")[1] to it.split(",")[2] }.toMap()

    for (item in menuItems) {
        val itemSize = item.length
        val price = map[item].toString()
        val times = 34 - (itemSize + price.length)

        menu += "\n$item${".".repeat(times)}$price"
    }

    menu += "\n"
    return menu
}//fancyMenuLook