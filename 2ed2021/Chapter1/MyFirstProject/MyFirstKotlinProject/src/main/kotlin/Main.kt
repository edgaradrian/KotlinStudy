
const val NOMBRE = "Edgar Adrián"
fun main() {
    println("Inicia el nivel")

    println(NOMBRE)

    var level = 4
    println(level)

    val booleanVal = true
    val newBooleanVal = false
    val name = "addick"

    if (level == 1) {
        println("Está en el nivel uno")
    } else if (level <= 5) {
        println("Más de 1 hasta 5")

        if (!newBooleanVal && (booleanVal || name == "addick")) {
            println("Bandera activada")
        }

    } else if (level == 6) {
        println("Nivel 6")
    } else {
        println("Has superado el nivel 1")
    }

    println("Subiendo de nivel")
    level += 1
    println(level)
}//main