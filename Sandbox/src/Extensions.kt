fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun Any.easyPrint(): Any {
    println(this)
    return this
}

fun main(args: Array<String>) {
    "Edgar has left the building".easyPrint().addEnthusiasm().easyPrint()
    87.easyPrint()
}//main

