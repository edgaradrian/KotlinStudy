val planets = setOf("Mercury", "Venus", "Earth", "Earth")

fun main(args: Array<String>) {
    println(planets)

    val containsEarth = planets.contains("Earth")
    println(containsEarth)

    val containsYavin = planets.contains("Yavin")
    println(containsYavin)

    val thirdPlanet = planets.elementAt(2)
    println(thirdPlanet)
}//main