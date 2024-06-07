package org.example
object NoMovieList

fun main() {
    println("Creational Patterns")
    singletonPattern()
}//main

/********* Singleton **********/
fun singletonPattern() {

    val myFavoriteMovies = NoMovieList
    val herFavoriteMovies = NoMovieList

    println("myFavoriteMoview and herFavoriteMovies have the same instance? ${ myFavoriteMovies === herFavoriteMovies }")


}//singletonPattern
