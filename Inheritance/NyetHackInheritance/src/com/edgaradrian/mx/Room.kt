package com.edgaradrian.mx

open class Room(val name: String) {

    protected open val dangerLevel = 5

    fun description() = "Room: $name\n" +
            "Danger level: $dangerLevel"
    open fun load() = "Mothing much to see here"

}//class com.edgaradrian.mx.Room

class TownSquare : Room("Town Square") {
    override val dangerLevel = super.dangerLevel - 3
    private var bellSound = "GWONG"

    override fun load() = "The villagers rally and cheer as you enter!\n${ringBell()}"

    private fun ringBell() = "The bell tower announces your arrival. $bellSound"
}//TownSquare
