package com.edgaradrian.mx

fun main(args: Array<String>) {

    //val player = Player("Edgar", 90, true, false)
    val player = Player("Edgar")
    player.castFireball()

    var currentRoom: Room = TownSquare()
    println(currentRoom.description())
    println(currentRoom.load())

    //Type Checking
    var room = Room("Foyer")
    println("room is Room? ${room is Room}")
    println("room is TownSquare?: ${room is TownSquare}")

    var townSquare = TownSquare()
    println("townSquare is TownSquare ${townSquare is TownSquare}")
    println("townSquare is Room ${townSquare is Room}")

    var className = when(townSquare) {
        is TownSquare -> "TownSquare"
        is Room -> "Room"
        else -> throw IllegalArgumentException()
    }//className
    println(className)

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



