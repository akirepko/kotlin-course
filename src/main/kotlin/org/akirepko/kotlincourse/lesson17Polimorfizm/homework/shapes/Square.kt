package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.two

class Square(
    val height: Double,
    val weight: Double
) : Shape() {
    override fun area(): Double {
        return height * weight
    }

}