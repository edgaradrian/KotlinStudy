fun main(args: Array<String>) {
    //var signatureDrink = "Buttered Ate"
    //signatureDrink = null
    //var beverage = readLine()?.capitalize()
    var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Chela"
        }
    }
//    beverage = null
    println(beverage)
}//main