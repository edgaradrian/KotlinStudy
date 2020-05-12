import kotlin.math.*
import kotlin.random.Random

fun main(args: Array<String>) {
    println("^^^^^^Hello Kotlin^^^^^^")

    maths()

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

    ChallengesChapter3()

    miniExercisesChapter4()

    basicControlFlow()

    advanceControlFlow()

    miniExercisesChapter5()

    whenExpressions()

    Functions()

    nullability()

    println(">>>Arrays")
    val evenNumbers = arrayOf(0,2,4,6,8,10)
    println(">evenNumbers")
    evenNumbers.forEach {
        println("$it")
    }

    println(">fiveFives")
    val fiveFives = Array(5, {5}) // 5,5,5,5,5
    for (five in fiveFives) {
        println("$five")
    }//fiveFives

    println(">vowels")
    val vowels = arrayOf('a','b','c','d','e')
    vowels.forEach {
        println(it)
    }

    val oddNumbers = intArrayOf(1,3,5,7)

    val zeros = DoubleArray(4) // 0.0, 0.0, 0.0, 0.0, 0.0

    val otherOddNumbers = arrayOf(1,3,5,7,9).toIntArray()

    println(">>>Lists")
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    println(">innerPlanets")
    innerPlanets.forEach {
        println(it)
    }//innerPlanets

    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")
    println(">innerPlanetsArrayList")
    innerPlanetsArrayList.forEach {
        println(it)
    }//innerPlanetsArrayList

    println(">>>Mutable List")
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val players = mutableListOf("Edgar", "Dulce", "Miranda", "Gael")

    if (players.size < 2) {
        println("We need at least two players")
    } else {
        println("let's start!")
    }//else

    var currentPlayer = players.first()
    println("currentPlayer: $currentPlayer")
    println("lastPlayer: ${players.last()}")

    val minPlayer = players.min()
    minPlayer.let {
        println("$minPlayer will start")
    }

    val maxPlayer = players.max()
    if (maxPlayer != null) {
        println("$maxPlayer is the MAX")
    }

    val firstPlayer = players[0]
    println("First Player is $firstPlayer")

    val secondPlayer = players.get(1)
    println("Second Player is $secondPlayer")

    val upcomingPlayersSlice = players.slice(1..2)
    println("upcomingPlayersSlice: ${upcomingPlayersSlice.joinToString()}")

    players.add("Batman")
    players += "Robin"

    println("players joined: ${players.joinToString()}")

    players.add(5, "Catwoman")

    println("players joined + Catwoman ${players.joinToString()}")

    val wasPlayerRemoved = players.remove("Robin")
    println("It is $wasPlayerRemoved that Robin was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")

    val indexOfBatman = players.indexOf("Batman")
    println("Batman is the $indexOfBatman element")

    println("current players joined: ${players.joinToString {  }}")

}//main

private fun nullability() {
    println(">>>Nullability")
    var authorName: String? = "Federico Gamboa"
    var authorAge: Int? = 32

    val ageAfterBirthday = authorAge!! + 1
    println("After their next birthday, author will be $ageAfterBirthday")

    var nonNullableAuthor: String
    val nullableAuthor: String?

    if (authorName != null) {
        nonNullableAuthor = authorName
    } else {
        nullableAuthor = authorName
    }

    println(">>Mini Exercises")
    var myFavoriteSong: String?
    myFavoriteSong = "Lemon"

    println("my favorite song is: $myFavoriteSong")

    if (myFavoriteSong != null) {
        println("myFavoriteSong is not null!")
    } else {
        println("myFavoriteSong is null")
    }

    println(">Safe calls")
    var nameLength = authorName?.length
    println("Author's name has length $nameLength")
    var nameLengthPlus5 = authorName?.length?.plus(5)
    println("Author's name length plus 5 is $nameLengthPlus5")

    println(">Let")
    authorName?.let {
        println("authorName length let function: ${authorName.length}")
    }

    println(">Elvis Operator")
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0
    println("mustHaveResult: $mustHaveResult")

    println(">>Challenges")
    println(">1")
    divideIfWhole(10, 2)
    divideIfWhole(7, 2)
    divideIfWhole(100, 10)
}

fun divideIfWhole(value: Int, divisor: Int): Int? {
    if (value % divisor == 0) {
        val result = value / divisor
        println("Yep, it divides $result times")
        return result
    } else {
        println("Not divisible :[")
        return null
    }
}//divideIfWhole

private fun Functions() {
    println(">>>Functions")
    printMyName()
    printMultipleOfFive(10)
    printMultipleOf(4, 2)
    multiply(5, 5)

    val (product, quotient) = multiplyAndDivide(5, 2)
    println("The product $product")
    println("The quotient $quotient")

    fun multiplyInferred(number: Int, multiplier: Int): Int = number * multiplier
    println("multiplyInferred ${multiplyInferred(5, 5)}")

    println(">>MiniExercises")
    println(">1")
    printFullName("Edgar", "Adrián")
    println(">2")
    val (firstNameLength, lastNameLength) = calculateFullName("Edgar", "Adrián")
    println("first name length $firstNameLength")
    println("second name length $lastNameLength")

    println(">>Functions as variables")
    var function = ::add
    var returnFunction = function(4, 5)
    println("return Function: $returnFunction")
}

fun add(a: Int, b: Int): Int {
    return a + b
}//add

fun calculateFullName(firstName: String, lastName: String): Pair<Int, Int> {
    return Pair(firstName.length, lastName.length)
}

fun printFullName(firstName: String, lastName: String) {
    println(firstName + " " + lastName)
}//printFull

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}//multiplyAndDivide

fun multiply(number: Int, multiplier: Int): Int {
    return number * multiplier
}//multiply

fun printMultipleOf(multiplier: Int, andValue: Int) {
    println("$multiplier * $andValue = ${multiplier * andValue}")
}//printMultipleOf

fun printMultipleOfFive(value: Int) {
    println("$value * 5 = ${value * 5}")
}//printMultipleOfFive

fun printMyName(){
    println("My name is Edgar Adrián")
}//printMyName

private fun whenExpressions() {
    println(">>>When expressions")
    val number = 10
    when (number) {
        0 -> println("It's zero")
        else -> println("Non-zero")
    }//when
    when (number) {
        10 -> println("It's ten!")
    }
    val string = "Dog"
    when (string) {
        "Cat", "Dog" -> println("Animal is a house pet")
        else -> println("Animal is not a house pet")
    }//when Dog
    println(">>Returning values...")
    val numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknown number")
            "Unknown"
        }
    }//numberName
    println(numberName)
    val hourOfDay = 12
    val timeOfDay: String

    timeOfDay = when (hourOfDay) {
        in 0..5 -> "Early Morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late evening"
        else -> "INVALID HOUR!"
    }//timeOfDay
    println(timeOfDay)
    println(">Other example")
    when {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }//when
    println(">>Mini Exercises When Expression")
    println(">1")
    val myAge = 32
    when (myAge) {
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        else -> println("Elderly")
    }//when my Age
    println(">2")
    val myPair = Pair("Edgar Adrian", 32)
    val (name, age) = myPair
    when (age) {
        in 0..2 -> println("${name} is an Infant")
        in 3..12 -> println("${name} is a Child")
        in 13..19 -> println("${name} is a Teenager")
        in 20..39 -> println("${name} is an Adult")
        in 40..60 -> println("${name} is a Middle aged")
        else -> println("${name} is an Elderly")
    }
}

private fun miniExercisesChapter5() {
    println(">>Mini Exercises")
    println(">1")
    val range = 1..10
    for (i in range) {
        println("The square is ${i * i}")
    }//for range
    println(">2")
    for (i in range) {
        println("The square root is ${sqrt(i.toDouble())}")
    }
}

private fun advanceControlFlow() {
    println(">>>Advanced Control Flow")
    println(">While")
    val count = 10
    var sum = 0

    for (i in 1..count) {
        sum += i
        println("the sum here is: $sum")
    }//for

    println(">Repeat")
    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
        println("The lastSum is now: $lastSum")
    }//repeat

    println(">Step")
    sum = 0
    for (i in 1..count step 2) {
        sum += i
        println("The sum: $sum")
    }//for step

    println(">DownTo")
    sum = 0
    for (i in count downTo 1 step 2) {
        sum += i
        println("The sum downTo is: $sum")
    }//for
}

private fun basicControlFlow() {
    println(">>>IF Expression")
    val animal = "Fox"

    if (animal == "Cat" || animal == "Dog") {
        println("Animal is a house pet")
    } else {
        println("Animal is not a house pet")
    }
    println(">>mini exercises")
    println(">1")
    val myAge = 32
    if (myAge in 13..19) {
        println("I am a teenage")
    } else {
        println("I am not a teenage")
    }//if myAge
    println(">>>WHILE mini exercises")
    var counter = 0
    while (counter < 10) {
        println("counter while $counter")
        counter += 1
    }//while
    println(">2")
    var counter1 = 0
    var roll = 0
    do {
        roll = Random.nextInt(6)
        counter1 += 1
        println("roll: $roll, counter1: $counter1")
    } while (roll != 5)
}

private fun miniExercisesChapter4() {
    println(">>>Mini exercises chapter 4")
    println(">1")
    val myAge = 32
    val isTeenager = myAge in 13..19
    println("isTeenager $isTeenager")
    println(">2")
    val theirAge = 30
    val bothTeenagers = (theirAge in 13..19) && isTeenager
    println("bothTeenagers $bothTeenagers")
    println(">3")
    val reader = "Edgar Adrian"
    val author = "Edgar Adrian"
    val authorIsReader = reader == author
    println("authorIsReader $authorIsReader")
}

private fun ChallengesChapter3() {
    println(">>>Challenges Chapter 3")
    println(">1")
    val coordenadas = 2 to 3
    println(">2")
    val (row, column) = coordenadas
    println("row: $row")
    println("column: $column")
    println(">10")
    println("kotlin.math.PI: " + PI)
    println("kotlin.math.PI.toFloat(): " + PI.toFloat())
}

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