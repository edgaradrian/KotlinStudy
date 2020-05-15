import java.lang.IllegalStateException

fun main(args: Array<String>) {
    var swordJuggling: Int? = null
    val isJugglingProficent = (1..3).shuffled().last() == 3
    if (isJugglingProficent) {
        swordJuggling = 2
    }

    proficiencyCheck(swordJuggling)
    swordJuggling = swordJuggling!!.plus(1)

    println("You juggle $swordJuggling sword!")
}//main

fun proficiencyCheck(swordsJuggling: Int?) {
    swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords")
}//proficiencyCheck

class UnskilledSwordJugglerException() : IllegalStateException("Player cannot juggle swords")