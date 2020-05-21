class Player {
    var name = "edgar"
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    var healthPoints = 90
    val isBlessed = true
    val isImmortal = false

    fun castFireball(numFireballs: Int = 2) = println("A glass of Fireball springs into existence. (x$numFireballs)")
}//Player
