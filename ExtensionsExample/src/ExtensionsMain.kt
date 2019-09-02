import java.util.*

//Extension Date
fun Date.plusDays(n: Int) = Date(this.time + n * 86400000)

//Extension Number
fun Number.print() = println("Number $this")

//Extension Int
fun Int.print() = println("Int $this")

//Infix function
infix fun Int.times(str: String) = str.repeat(this)

fun main(args: Array<String>) {

    //Date
    val now = Date()
    val tomorrow = now.plusDays(1)
    println("Tomorrow: $tomorrow")

    //Number
    val myNumber: Number = 5
    myNumber.print()

    //Int
    val myInt: Int = 1
    myInt.print()

    //infix fun
    val myInfixFun = 3 times "Beetlejuice "
    println("infix times: $myInfixFun")
    

}//main