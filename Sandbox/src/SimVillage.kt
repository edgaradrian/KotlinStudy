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
        val currenteYear = 2019
        "Welcome to SimVillage, $player (copyright $currenteYear)"
    }//otherGreetingFunction

    println(otherGreetingFunction("addick"))

}//main