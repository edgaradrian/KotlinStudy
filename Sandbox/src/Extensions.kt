val String.numVowels
get() = count { "aeiou".contains(it) }

fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun main(args: Array<String>) {
    "Edgar has left the building".easyPrint().addEnthusiasm().easyPrint()
    87.easyPrint()
    "How many vowels?".numVowels.easyPrint()
}//main

