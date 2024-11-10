package org.example.org.akirepko.kotlincourse.lesson19Abstraction


interface WaterStorable {
    val volume: Int
    fun  fill(amount: Int)
    fun take (amount: Int)
}