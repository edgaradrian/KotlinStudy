package com.edgaradrian.mx

fun main(args: Array<String>) {

    val player = Player("Edgar", 90, true, false)
    player.castFireball()

    val auraColor = player.auraColor()

    printPlayerStatus(player)

    //Computed properties
    val d6 = Dice()
    println(d6.rolledValue)
    println(d6.rolledValue)
    println(d6.rolledValue)

}//com.edgaradrian.mx.main

private fun printPlayerStatus(
    player: Player
) {
    println(
        "(Aura: ${player.auraColor()})" +
                "(Blessed: ${if (player.isBlessed) "YES" else "NO"})"
    )
    println("${player.name} ${player.formatHealthStatus()}")
}//com.edgaradrian.mx.printPlayerStatus



