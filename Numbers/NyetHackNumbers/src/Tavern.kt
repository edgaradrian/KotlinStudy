import kotlin.math.roundToInt
const val TAVERN_NAME = "Lobohombo's Folly"
var playerGold = 10
var playerSilver = 10

fun main(args: Array<String>) {
    placeOrder("shandy,Dragon's Breath,5.91")
}//main

fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    val remainingBalance = totalPurse - price
    println("Remaining balance:  ${"%.2f".format(remainingBalance)}")

    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    displayBalance()
}//performPurchase

private fun displayBalance() {
    println("Player's purse balance: Gold: $playerGold , Silver: $playerSilver")
}//displayBalance

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

    performPurchase(price.toDouble())
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