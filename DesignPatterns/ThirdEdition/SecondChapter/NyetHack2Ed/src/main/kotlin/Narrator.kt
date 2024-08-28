fun narrate(
    message: String
) {
    println({
       val numExclamationsPoints = 3
       "¡" + message.uppercase() + "!".repeat(numExclamationsPoints)
    }())
}//narrate