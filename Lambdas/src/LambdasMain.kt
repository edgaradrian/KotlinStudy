fun main(args: Array<String>) {

    //Long
    val sumatoria: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val resultSumatoria = sumatoria(5, 10)
    println("The result sumatoria is: $resultSumatoria")

    //Medium
    val adicion: (Int, Int) -> Int = { x, y -> x + y }
    val resultAdicion = adicion(23, 3)
    println("The result adicion is: $resultAdicion")

    //short
    val suma = { x: Int, y: Int -> x + y }
    val resultSuma = suma(7, 7)
    println("The result suma is: $resultSuma")

    //use it
    val toUpper: (String) -> String = { it.toUpperCase() }
    val resultToUpper = toUpper("edgar adrian")
    println("The result toUpper is: $resultToUpper")

    //use reference
    val toUpperReference: (String) -> String = String::toUpperCase
    val resultToUpperReference = toUpperReference("edgar adrian")
    println("The result toUpperReference is: $resultToUpperReference")


}//main