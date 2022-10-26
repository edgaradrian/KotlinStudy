
const val NOMBRE = "Edgar Adrián"
fun main() {
    println("Inicia el nivel")

    println(NOMBRE)

    var level = 3
    println(level)

    if (level == 1) {
        println("Está en el nivel uno")
    } else {
        println("Ha superado el nivel 1")
    }

    println("Subiendo de nivel")
    level += 1
    println(level)
}//main