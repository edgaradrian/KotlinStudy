val narrationModifier: (String) -> String =  {
    val numExclamationsPoints = 3
    "¡" + it.uppercase() + "!".repeat(numExclamationsPoints)
}

fun narrate(
    message: String
) {
    println(narrationModifier(message))
}//narrate