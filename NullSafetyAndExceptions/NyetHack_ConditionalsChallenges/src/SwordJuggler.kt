fun main(args: Array<String>) {
    var swordJuggling: Int? = null
    val isJugglingProficent = (1..3).shuffled().last() == 3
    if (isJugglingProficent) {
        swordJuggling = 2
    }

    println("You juggle $swordJuggling sword!")
}//main