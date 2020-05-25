package com.edgaradrian.mx

fun main(args: Array<String>) {

    //Type Checking
    var room = Room("Foyer")
    println("room is Room? ${room is Room}")
    println("room is TownSquare?: ${room is TownSquare}")

    var townSquare = TownSquare()
    println("townSquare is TownSquare ${townSquare is TownSquare}")
    println("townSquare is Room ${townSquare is Room}")

    var className = when(townSquare) {
        is Room -> "Room"
        is TownSquare -> "TownSquare"
        else -> throw IllegalArgumentException()
    }//className
    println(className)

    Game.play()

}//com.edgaradrian.mx.main



fun printIsSourceOfBlessings(any: Any) {
    val isSourceOfBlessings = if (any is Player) {
        any.isBlessed
    } else {
        (any as Room).name == "Fount of Blessing"
    }
}//printIsSourceOfBlessings

object Game {

    private val player = Player("Edgar")
    private var currentRoom: Room = TownSquare()

    private var worldMap = listOf(
        listOf(currentRoom, Room("Tavern"), Room("Back Room")),
        listOf(Room("Long Corridor"), Room("Generic Room"))
    )//worldMan

    init {
        println("Welcome, adventurer.")
        player.castFireball()
    }

    fun play() {
        while (true) {
            println(currentRoom.description())
            println(currentRoom.load())

            printPlayerStatus(player)

            print("> Enter your command: ")
            println(GameInput(readLine()).processCommand())
        }
    }//play

    private fun printPlayerStatus(
        player: Player
    ) {
        println(
            "(Aura: ${player.auraColor()})" +
                    "(Blessed: ${if (player.isBlessed) "YES" else "NO"})"
        )
        println("${player.name} ${player.formatHealthStatus()}")
    }//com.edgaradrian.mx.printPlayerStatus

    private class GameInput(arg: String?) {
        private val input = arg ?: ""
        val command = input.split(" ")[0]
        val argument = input.split(" ").getOrElse(1, { "" })

        fun processCommand() = when (command.toLowerCase()) {
            else -> commandNotFound()
        }

        private fun commandNotFound() = "I'm not quite sure what you're trying to do!"

    }//GameInput

    

}//object Game

