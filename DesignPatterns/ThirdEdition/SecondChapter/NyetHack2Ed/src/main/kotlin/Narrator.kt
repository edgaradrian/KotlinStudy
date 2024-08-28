import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier: (String) -> String = { it }

fun narrate(
    message: String
) {
    println(narrationModifier(message))
}//narrate

fun changeNarratorMood() {

    val mood : String
    val modifier:  (String) -> String

    when (Random.nextInt(1..4)) {

        1 -> {
            mood = "loud"
            modifier = { message ->
                val numExclamationPoint = 3
                "¡".repeat(numExclamationPoint) + message.uppercase() + "!".repeat(numExclamationPoint)
            }
        }

        2 -> {
            mood = "tired"
            modifier = { message ->
                message.lowercase().replace(" ", "... ")
            }
        }

        3 -> {
            mood = "unsure"
            modifier = { message ->
                "¿$message?"
            }
        }

        else -> {
            mood = "professional"
            modifier = { message ->
                "$message."
            }
        }
    }

        narrationModifier = modifier
        narrate("El narrador está en modo: $mood")

}//changeNarratorMood