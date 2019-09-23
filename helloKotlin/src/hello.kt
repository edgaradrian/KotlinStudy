import kotlin.math.*

fun main(args: Array<String>) {
    println("^^^^^^Hello Kotlin^^^^^^")

    maths()

    println(">>>Variables and Constants")
    val myAge:Int = 32
    println("My age: $myAge")

    exercisesChapter2()

    println(">>>Type Conversion")
    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()

    println(">>>Chapter 3 Mini exercises")
    val age1 = 21
    val age2 = 42

    val avg1Int = (age1 + age2) / 2
    println("avg1 as Int $avg1Int")
    val avg1Double = ((age1 + age2) / 2).toDouble()
    println("avg1 as Double $avg1Double")

    charactersAndStrings()
    pairAndTriples()

    println(">>>Any, Unit and Nothing Types")
    val anyNumber: Any = 42
    val anyString: Any = "42"

}//main

private fun pairAndTriples() {
    println(">>>Pair and Triples")
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    println("coordinates: ( ${coordinates.first} , ${coordinates.second} )")
    val coordinatesInferred = Pair(4, 5)
    println("coordinatesInferred: ( ${coordinatesInferred.first}, ${coordinatesInferred.second} )")
    val coordinatesWithTo = 6 to 7
    println("coordinatesWithTo ( ${coordinatesWithTo.first}, ${coordinatesWithTo.second} )")
    println(">destructuring declaration...")
    val (x, y) = coordinates
    println("destructuring coordinates ($x,$y)")
    println(">>Triples")
    val coordinate3D = Triple(1, 2, 3)
    val (x2, y2, z2) = coordinate3D
    println("destructuring coordinates ($x2,$y2,$z2)")
    println("Triple -> First Element: ${coordinate3D.first}")
    println("Triple -> Second Element: ${coordinate3D.second}")
    println("Triple -> Third Element: ${coordinate3D.third}")
    println(">>Mini exercises Pair and Triples")
    println(">1")
    val date = Triple(23, 9, 2019)
    println("The day is: ${date.first}")
    println("The month is: ${date.second}")
    println("The year is: ${date.third}")
    println(">2")
    val (day, month, year) = date
    println("date: $day-$month-$year")
    println(">3")
    var (_, month2, year2) = date
    println("date YYYYMM: $year2$month2")
    println(">4")
    month2 += 1
    val yyyyMM = Pair(month2, year2)
    println("the date YYYYMM is now: $year2$month2")
}//pairAndTriples

private fun charactersAndStrings() {
    println(">>>Characters and strings")
    val characterA: Char = 'a'
    println("My first Char " + characterA)
    val stringDog: String = "Dog"
    println("My first String $stringDog")
    var message = "Hello " + "my name is "
    val name = "Edgar Adrian"
    message += name
    println(message)
    val exclamationMark: Char = '!'
    message += exclamationMark
    println(message)
    val oneThirdLongString = "One third is ${1.0 / 3.0} as a decimal"
    println(oneThirdLongString)
    val bigString = """
        |You can have a string
        |that contains multiple
        |lines
        |by
        |doing this
    """.trimMargin()
    println(bigString)
    println(">>>More mini exercises chapter 3")
    val firstName = "Edgar"
    val lastName = "Adrian"
    val fullName = "$firstName $lastName"
    val myDetails = "Hi, my name is $fullName"
    println(">" + myDetails)
}//charactersAndStrings

private fun maths() {
    println(">>>Maths")
    println(2 + 6)
    println(10 - 2)
    println(2 * 4)
    println(24 / 3)
    println(sin(45 * PI / 180))
    println(cos(135 * PI / 180))
    println(sqrt(2.0))
    println(max(5, 10))
    println(min(-5, -10))
    println(max(sqrt(3.0), PI / 2))
}//maths

private fun exercisesChapter2() {
    println(">>>Exercises")

    println(">1")
    val exercises = 9
    var exercisesSolved = 0
    exercisesSolved += 1
    println("Exercises solved $exercisesSolved")
    println(">")
    println(">2")
    var age = 32
    age = 16
    print(age)
    age = 30
    print(age)
    exercisesSolved += 1
    println("Exercises solved $exercisesSolved")
    println(">")
    println(">3")
    val a: Int = 46
    val b: Int = 10
    //1
    val answer1: Int = (a * 100) + b
    println("answer1: $answer1")
    //2
    val answer2: Int = (a * 100) + (b * 100)
    println("answer2: $answer2")
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println("answer3: $answer3")
    exercisesSolved += 1
    println("Exercises solved $exercisesSolved")
    println(">")
    println(">4")
    println(5 * 3 - 4 / 2 * 2)
    val parentheses = "(5 * 3) - ((4 / 2) * 2))"
    println("5 * 3 - 4 / 2 * 2  = " + parentheses)
    exercisesSolved += 1
    println("Exercises solved $exercisesSolved")
    println(">")
    println(">5")
    val A: Double = 6.1
    val B: Double = 8.6
    val average: Double = (A + B) / 2
    println("average: $average")
    exercisesSolved += 1
    println("Exercises solved $exercisesSolved")
    println(">")
    println(">6")
    val x1: Double = 4.5
    val y1: Double = 2.2
    val x2: Double = 8.6
    val y2: Double = 6.1
    val distance = hypot((x2 - x1), (y2 - y1))
    println("The distance is: $distance")
    exercisesSolved += 4
    println("Exercises solved: $exercisesSolved")
}//exercises