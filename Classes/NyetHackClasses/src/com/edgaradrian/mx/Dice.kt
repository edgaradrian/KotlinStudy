package com.edgaradrian.mx

class Dice {
    val rolledValue
    get() = (1..6).shuffled().first()
}//com.edgaradrian.mx.Dice