fun main(args: Array<String>) {

    val player = Player()
    player.castFireball()

    val auraColor = player.auraColor()

    printPlayerStatus(player)

    //Computed properties
    val d6 = Dice()
    println(d6.rolledValue)
    println(d6.rolledValue)
    println(d6.rolledValue)

}//main

private fun printPlayerStatus(
    player: Player
) {
    println(
        "(Aura: ${player.auraColor()})" +
                "(Blessed: ${if (player.isBlessed) "YES" else "NO"})"
    )
    println("${player.name} ${player.formatHealthStatus()}")
}//printPlayerStatus



