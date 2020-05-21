fun main(args: Array<String>) {

    val name = "addick"
    var healthPoints = (Math.random() * 100).toInt()
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    val player = Player()

    //Challenge Enhancing the Aura
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()

    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "gray"
    }//auraColor

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition"
    }

    //Challenge Configurable Status Format
    val statusFormatString ="(HP: $healthPoints)(Aura: $auraColor) -> $name $healthStatus"

    println(statusFormatString)

}//main