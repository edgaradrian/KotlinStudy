const val NOMBRE = "Edgar Adrián"
var level = 4
fun main() {
    println("Inicia el nivel")

    read()

    println("Subiendo de nivel")
    level += 1
    println(level)
}//main

private fun read() {
    println(obtainQuest(level, false, false, "addickted"))
}//read

private fun obtainQuest(
    level: Int,
    newBooleanVal: Boolean,
    booleanVal: Boolean,
    name: String
): String {
    val quest: String = when (level) {
        1 -> "Está en el nivel uno"
        in 2..5 -> {
            val logicalOperator = !newBooleanVal && (booleanVal || name == "addick")

            if (logicalOperator) {
                "Más de 1 hasta 5 con operador true"
            } else {
                "Más de 1 hasta 5 con operador false"
            }
        }

        6 -> "Nivel 6"
        else -> "Has superado el nivel 1"
    }
    return quest
}//obtainQuest