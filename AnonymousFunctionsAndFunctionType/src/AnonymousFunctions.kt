val countLetters = "Mississippi".count()
val countLettersAnonymousFunction = "Mississippi".count { letter -> letter == 's' }

fun main(args: Array<String>) {
    //print normal function
    println("Mississippi has $countLetters letters")
    //print count s
    println("Mississippi has $countLettersAnonymousFunction times letter s")
}//main