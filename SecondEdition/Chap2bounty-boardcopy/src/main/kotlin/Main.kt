const val HERO_NAME = "addick"
fun main(args: Array<String>) {
    println("The hero starts the game")

    //Challenge: Magic Mirror
    println(HERO_NAME)
    val mirrorHeroName = HERO_NAME.reversed().apply { println(this) }

    var playerLevel = 4
    println(playerLevel)

    println("The hero killed the boss")
    playerLevel += 1
    println(playerLevel)

}//main