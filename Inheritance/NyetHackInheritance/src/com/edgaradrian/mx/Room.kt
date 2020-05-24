package com.edgaradrian.mx

open class Room(val name: String) {

    protected open val dangerLevel = 5

    fun description() = "Room: $name\n" +
            "Danger level: $dangerLevel"
    open fun load() = "Mothing much to see here"

}//class com.edgaradrian.mx.Room

class TownSquare : Room("Town Square") {
    override fun load() = "The villagers rally and cheer as you enter"
}

