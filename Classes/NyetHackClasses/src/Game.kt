fun main(args: Array<String>) {


    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val player = Player()
    player.castFireball()

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(auraColor, isBlessed, player.name, healthStatus)

    //Computed properties
    val d6 = Dice()
    println(d6.rolledValue)
    println(d6.rolledValue)
    println(d6.rolledValue)

}//main

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor)" +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}//printPlayerStatus



