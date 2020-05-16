const val TAVERN_NAME = "Lobohombo's Folly"

fun main(args: Array<String>) {
    placeOrder()
}//main

private fun placeOrder() {
    val indexOfApostrophe = TAVERN_NAME.indexOf("\'")
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Dulce speaks with $tavernMaster about their order.")
}//place order