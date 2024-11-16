package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework

import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.one.Bird
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.one.Cat
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.one.Dog
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.printer.LaserPrinter
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.two.Circle
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.two.Square
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.two.Triangle

fun main() {
    val animales = listOf(Cat(), Dog(), Bird())
    animales.forEach { it.makeSound() }

    val shapes = listOf(Circle(2.0), Square(2.0, 3.0), Triangle(2.0, 3.0, 179.0))
    shapes.forEach { println(it.area()) }

    val text= LaserPrinter("Мама  мыла раму")
    text.printColored()


    val cart = Basket()
    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(3 to 2, 4 to 1))
    cart.addToCart(listOf(1, 2, 5, 6, 7, 8, 9, 10, 11))
    println(cart)
}