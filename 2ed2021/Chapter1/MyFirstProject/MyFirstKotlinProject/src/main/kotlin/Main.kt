
const val NOMBRE = "Edgar Adrián"
fun main() {
    println("Inicia el nivel")

    println(NOMBRE)

    var level = 6
    println(level)

    if (level == 1) {
        println("Está en el nivel uno")
    } else if (level <= 5) {
        println("Más de 1 hasta 5")
    } else if (level == 6) {
        println("Nivel 6")
    } else {
        println("Has superado el nivel 1")
    }

    println("Subiendo de nivel")
    level += 1
    println(level)
}//main