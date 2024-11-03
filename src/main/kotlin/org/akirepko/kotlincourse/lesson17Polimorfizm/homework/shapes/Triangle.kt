package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.two

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val corner: Double
) : Shape() {
    override fun area(): Double {

        return sideA * sideB * Math.sin(corner)
    }
}