class Player {
    val name = "Edgar"
        get() = field.capitalize()

    fun castFireball(numFireballs: Int = 2) = println("A glass of Fireball springs into existence. (x$numFireballs)")
}//Player
