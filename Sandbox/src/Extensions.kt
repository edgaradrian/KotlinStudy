fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun main(args: Array<String>) {
    println("Edgar has left the building".addEnthusiasm())
}//main

