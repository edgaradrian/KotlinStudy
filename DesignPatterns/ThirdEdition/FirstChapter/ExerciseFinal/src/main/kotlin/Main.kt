package org.example

fun main() {
    val list = listOf("hellO wOrlD", null, "fRom", null, "kOtlin")
    println("${ skipped(list) }")
}//main

fun skipped(myList: List<String?>): List<String> {

    val myMutableList = myList.filterNotNull()
    println("${ myMutableList.map { it.split(" ") } }")
    return myMutableList.map { it.lowercase().replaceFirstChar(Char::titlecase) }

}//skipped

