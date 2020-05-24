package com.edgaradrian.mx

fun main(args: Array<String>) {

    //val player = Player("Edgar", 90, true, false)
    val player = Player("Edgar")
    player.castFireball()

    var currentRoom: Room = TownSquare()
    println(currentRoom.description())
    println(currentRoom.load())

    printPlayerStatus(player)

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



