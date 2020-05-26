package com.edgaradrian.mx

open class Room(val name: String) {

    protected open val dangerLevel = 5
    var monster: Monster? = Goblin()

    fun description() = "Room: $name\n" +
            "Danger level: $dangerLevel\n" +
            "Crature: ${monster?.description ?: "none"}"
    open fun load() = "Mothing much to see here"

}//class com.edgaradrian.mx.Room

open class TownSquare : Room("Town Square") {
    override val dangerLevel = super.dangerLevel - 3
    private var bellSound = "GWONG"

    final override fun load() = "The villagers rally and cheer as you enter!\n${ringBell()}"

    private fun ringBell() = "The bell tower announces your arrival. $bellSound"
}//TownSquare

