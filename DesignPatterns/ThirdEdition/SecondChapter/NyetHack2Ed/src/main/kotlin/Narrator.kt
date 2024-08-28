fun narrate(
    message: String
) {
    val narrationModifier: () -> String =  {
        val numExclamationsPoints = 3
        "¡" + message.uppercase() + "!".repeat(numExclamationsPoints)
    }

    println(narrationModifier)
}//narrate