//plus
operator fun Int.plus(str: String) = this + str.length
//minus
operator fun String.minus(str: String) = this.removeSuffix(str)
//times
operator fun Int.times(str: String) = str.repeat(this)

fun main() {

    val operatorPlus = 5 + "Edgar Adrian"
    println(operatorPlus)

    val operatorTimes = 3 * "Beetlejuice "
    println("$operatorTimes")

    val operatorMinus = "Edgar Adrian" - "Adrian"
    println(operatorMinus)

}//main