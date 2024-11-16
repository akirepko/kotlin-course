package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.two

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return radius * radius * 3.14
    }
}