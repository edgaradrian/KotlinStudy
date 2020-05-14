import kotlin.test.currentStackTrace

fun main(args: Array<String>) {

    val numLetters = "Mississippi".count()
    println(numLetters)

    val numLettersS = "Mississippi".count { it == 's' }
    println("$numLettersS times in Mississippi")

    println({
        val currentYear = 2019
        "Welcome to SimVillage, Mayor (copyright $currentYear)"
    }())

    val greetingFunction: () -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, Mayor (copyright $currentYear)"
    }//greetingFunction

    println(greetingFunction())

    val otherGreetingFunction: (String) -> String = { player ->
        val currentYear = 2019
        "Welcome to SimVillage, $player (copyright $currentYear)"
    }//otherGreetingFunction

    println(otherGreetingFunction("addick"))

    val itGreetingFunction: (String) -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, $it (copyright $currentYear)"
    }//itGreetingFunction

    println(itGreetingFunction("addickted"))

    val multipleGreetingFunction: (String, Int) -> String = { player, buildings ->
        println("Adding $buildings houses")
        val currentYear = 2019
        "Welcome to SimVillage, $player (copyright $currentYear)"
    }//multipleGreetinfFunction

    println(multipleGreetingFunction("Edgar Adrian", 3))

    println(">")
    println(">")
    println("<<<Type Inference Support>>>")
    val typeInferenceGreetingFunction = { playerName:String, numBuildings:Int ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }//typeInferenceGreetingFunction
    println(typeInferenceGreetingFunction("Guyal",2))

/*    println("<<<Defining a Function That Accepts a Function>>>")
    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
*/

    /*runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName (copyright $currentYear)"
    }*/

    /*
    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }*/

    spaceAnd("Function Type as Return Type")
    runSimulation()

}//main

/*inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction: (String,Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))
}//runSimulation
*/
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}//runSimulation

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}//configureGreetingsFunction

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}

fun spaceAnd(title: String): Unit {
    println(">")
    println(">")
    println(">>>$title<<<")
}//spaceAnd