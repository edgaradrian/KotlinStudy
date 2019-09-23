fun main(args: Array<String>) {

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

}//main