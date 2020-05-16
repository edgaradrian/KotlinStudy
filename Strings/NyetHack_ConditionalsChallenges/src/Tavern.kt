const val TAVERN_NAME = "Lobohombo's Folly"

fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")
}//main

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf("\'")
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Dulce speaks with $tavernMaster about their order.")

    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "Dulce buys a $name ($type) for $price."
    println(message)
}//place order