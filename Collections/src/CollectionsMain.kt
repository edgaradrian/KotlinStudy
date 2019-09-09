//Collections

val languages = setOf("Kotlin", "Java", "Groovy")
val votes = listOf(true, false, true, false)
val countryToCapital = mapOf("Mexico" to "Mexico DF", "France" to "Paris")
val testData = arrayOf(0, 1, 2, 3, 4)

val votes1 = votes[1]
val testData2 = testData[2]
val capitalMexico = countryToCapital["Mexico"]
val capitalMexicoGet = countryToCapital.get("Mexico")

val numberOfYes = votes.filter { it == true }.count()
val searchResult = countryToCapital.keys.filter { it.startsWith("M") }.first()

fun main(args: Array<String>) {

    println("*** GET ELEMENTS ***")
    println("Print listOf[1] votes: $votes1")
    println("Print arrayOf[2] testData: $testData2")
    println("Print capitalMexico: $capitalMexico")
    println("Print capitalMexicoGet: $capitalMexicoGet")

    println()
    println("*** FILTER ***")
    println("numberOfYes: $numberOfYes")
    println("filter map: $searchResult")


}//main