fun main(args: Array<String>) {
    //var signatureDrink = "Buttered Ate"
    //signatureDrink = null
    //var beverage = readLine()?.capitalize()
    /*var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Chela"
        }
    }*/
    //var beverage = readLine()!!.capitalize()
    var beverage = readLine()

    if (!beverage.isNullOrBlank()) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage was null")
        beverage = null
    }

//    beverage = null
//    println(beverage)
    val beverageServed:String = beverage ?: "Chela"
    println(beverageServed)
}//main