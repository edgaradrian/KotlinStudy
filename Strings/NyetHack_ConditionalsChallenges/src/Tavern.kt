const val TAVERN_NAME = "Lobohombo's Folly"

fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")

    TAVERN_NAME.forEach {
        println("$it")
    }

}//main

private fun toDragonSpeak(phrase: String) = phrase.replace(Regex("[aeiouAEIOU]")) {
    when (it.value) {
        "a","A" -> "4"
        "e","E" -> "3"
        "i","I" -> "1"
        "o","O" -> "0"
        "u","U" -> "|_|"
        else -> it.value
    }
}//toDragonSpeak

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

    /*
    val phrase = "Ah, delicious $name!"
    println("Dulce exclaims: ${toDragonSpeak(phrase)}")
    */

    val phrase = if (name == "Dragon's Breath") {
        "Dulce exclaims ${toDragonSpeak("Ah, delicious $name")}"
    } else {
        "Dulce says: Thanks for the $name."
    }//phrase
    println(phrase)

    //Challenge: Improving DragonSpeak
    println("${toDragonSpeak(message.toUpperCase())}")

}//place order