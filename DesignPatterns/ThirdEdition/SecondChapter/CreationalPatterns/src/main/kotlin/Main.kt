package org.example

object NoMovieList : List<String> {//object NoMovieList
    override val size: Int = 0
    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<String> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<String> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<String> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<String> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: String): Int = 0

    override fun indexOf(element: String): Int = 0

    override fun containsAll(elements: Collection<String>) = false

    override fun contains(element: String): Boolean = false
}

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
