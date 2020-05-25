package com.edgaradrian.mx

enum class Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
}//Direction

data class Coordinate(val x: Int, val y: Int) {
    val isInBounds = x >= 0 && y >= 0
}//Coordinate