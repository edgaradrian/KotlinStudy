
const val NOMBRE = "Edgar Adrián"
fun main() {
    println("Inicia el nivel")

    println(NOMBRE)

    var level = 4
    println(level)

    val booleanVal = false
    val newBooleanVal = false
    val name = "addickted"

    val quest: String = if (level == 1) {
        "Está en el nivel uno"
    } else if (level <= 5) {
        "Más de 1 hasta 5"

        val logicalOperator = !newBooleanVal && (booleanVal || name == "addick")

        if (logicalOperator) {
            "Bandera activada"
        } else {
            "Bandera no activada"
        }

    } else if (level == 6) {
        "Nivel 6"
    } else {
        "Has superado el nivel 1"
    }

    println(quest)
    println("Subiendo de nivel")
    level += 1
    println(level)
}//main