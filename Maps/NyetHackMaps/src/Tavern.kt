import kotlin.math.roundToInt
import java.io.File
const val TAVERN_NAME = "Lobohombo's Folly"
var playerGold = 10
var playerSilver = 10
val patronList = listOf("Edgar", "Adrian", "Dulce")
val lastName = listOf("Ruiz", "Miranda", "Skywalker")
val uniquePatrons = mutableSetOf<String>()
val patronMutableList = mutableListOf("Edgar", "Adrian", "Dulce")
val menuList = File("data/tavern-menu-data.txt")
    .readText()
    .split("\n")
val patronGold = mapOf("Edgar" to 10.5, "Adrian" to 8.0, "Dulce" to 5.5)
val newPatronGold = mutableMapOf<String, Double>()

val patronPairGold = mapOf(Pair("Edgar",10.84), Pair("Adrian",9.00), Pair("Dulce", 6.50))
val patronMutableGold = mutableMapOf("Edgar" to 11.0, "Dulce" to 1.0 )

//Challenge: Remaining Pints
var cask = 5
var pint = .125

fun main(args: Array<String>) {

    if (patronList.contains("Edgar")) {
        println("The tavern master says: Edgar's in the back playing cards")
    } else {
        println("The tavern master says: Edgar isn't here")
    }

    if (patronList.containsAll(listOf("Adrian","Dulce"))) {
        println("The tavern master says: Yea, they're seated by the stew kettle.")
    } else {
        println("The tavern master says: Nay, they departed hours ago")
    }

    //placeOrder("shandy,Dragon's Breath,5.91")

    println(patronList)
    println(patronList[0])

    //MutableList
    println(patronMutableList)
    //patronMutableList.remove("Edgar")
    //patronMutableList.add("Addick")
    //patronMutableList.add(0,"Addick")
    //patronMutableList[0] = "Miranda"
    println(patronMutableList)

    for (patron in patronMutableList) {
        println("Good evening $patron")
    }

    patronMutableList.forEach { patron ->
        println("Good evening $patron")
    }//forEach

    patronMutableList.forEachIndexed { index, patron ->
        println("Good evening $patron - you're #${index + 1} in line")
        //placeOrder(patron, "shandy,Dragon's Breath,5.91")
        //placeOrder(patron, menuList.shuffled().first())
    }

    menuList.forEachIndexed { index, data ->
        println("$index : $data")
    }

    (0..9).forEach {
        val first = patronMutableList.shuffled().first()
        var last = lastName.shuffled().first()
        val name = "$first $last"
        uniquePatrons += name
    }
    println(uniquePatrons)

    uniquePatrons.forEach {
        newPatronGold[it] = 7.0
    }

    var orderCount = 0
    while (orderCount <= 9) {
//        placeOrder(uniquePatrons.shuffled().first(), menuList.shuffled().first())
        orderCount++
    }

    println(patronGold)
    println(patronGold["Edgar"])
    println(patronGold["Adrian"])
    println(patronGold["Astrid"])

    //PairType Map
    println(patronPairGold)

    //Adding a duplicate key
    patronMutableGold += "Dulce" to 11.33
    println(patronMutableGold)

    //Accesing a nonexistent index
    val nonexistentIndex = patronList.getOrElse(4) { "Unknown patron" }
    println(nonexistentIndex)

    //Testing getOrNull
    val fifthPatron = patronList.getOrNull(4) ?: "Unknown patron"
    println(fifthPatron)
}//main

/*fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    val remainingBalance = totalPurse - price

    if (remainingBalance >= 0) {
        println("Remaining balance:  ${"%.2f".format(remainingBalance)}")

        val remainingGold = remainingBalance.toInt()
        val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
        playerGold = remainingGold
        playerSilver = remainingSilver
        displayBalance()

        //Remaining pints
        val remainingGallons = cask - pint
        println("Remaning gallons: ${"%.3f".format(remainingGallons)}")
    } else {
        println("Not enough money")
    }

}//performPurchase
*/

fun performPurchase(price: Double, patronName: String) {
    val totalPurse = patronMutableGold.getValue(patronName)
    patronMutableGold[patronName] = totalPurse - price
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

private fun placeOrder(patronName: String, menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf("\'")
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    //println("Dulce speaks with $tavernMaster about their order.")
    println("$patronName speaks with $tavernMaster about their order")

    /*val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]*/
    val (type, name, price) = menuData.split(',')
    //val message = "Dulce buys a $name ($type) for $price."
    val message = "$patronName buys a $name ($type) for $price."
    println(message)

    performPurchase(price.toDouble(), patronName)
    /*
    val phrase = "Ah, delicious $name!"
    println("Dulce exclaims: ${toDragonSpeak(phrase)}")
    */

    val phrase = if (name == "Dragon's Breath") {
        //"Dulce exclaims ${toDragonSpeak("Ah, delicious $name")}"
        "$patronName exclaims: ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        //"Dulce says: Thanks for the $name."
        "$patronName says: Thanks for the $name"
    }//phrase
    println(phrase)

    //Challenge: Improving DragonSpeak
    println("${toDragonSpeak(message.toUpperCase())}")

}//place order