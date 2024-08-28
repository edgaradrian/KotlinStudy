val narrationModifier: (String) -> String =  { message ->
    val numExclamationsPoints = 3
    "¡" + message.uppercase() + "!".repeat(numExclamationsPoints)
}

fun narrate(
    message: String
) {
    println(narrationModifier(message))
}//narrate