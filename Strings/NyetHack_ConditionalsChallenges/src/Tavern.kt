const val TAVERN_NAME = "Lobohombo's Folly"

fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")
}//main

private fun toDragonSpeak(phrase: String) = phrase.replace(Regex("[aeiou]")) {
    when (it.value) {
        "a" -> "4"
        "e" -> "3"
        "i" -> "1"
        "o" -> "0"
        "u" -> "|_|"
        else -> it.value
    }
}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf("\'")
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Dulce speaks with $tavernMaster about their order.")

    /*val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]*/
    val (type, name, price) = menuData.split(',')
    val message = "Dulce buys a $name ($type) for $price."
    println(message)

    val phrase = "Ah, delicious $name!"
    println("Dulce exclaims: ${toDragonSpeak(phrase)}")
}//place order