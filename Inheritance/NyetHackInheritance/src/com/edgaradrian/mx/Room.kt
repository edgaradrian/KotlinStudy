package com.edgaradrian.mx

open class Room(val name: String) {

    fun description() = "Room: $name"
    open fun load() = "Mothing much to see here"

}//class com.edgaradrian.mx.Room

class TownSquare : Room("Town Square") {
    override fun load() = "The villagers rally and cheer as you enter"
}

