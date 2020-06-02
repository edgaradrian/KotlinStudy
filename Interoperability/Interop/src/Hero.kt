fun main(args: Array<String>) {
    val adversary = Jhava()
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.toUpperCase() ?: "It's complicated")

    val adversaryHitPoints: Int = adversary.hitPoints

}//main