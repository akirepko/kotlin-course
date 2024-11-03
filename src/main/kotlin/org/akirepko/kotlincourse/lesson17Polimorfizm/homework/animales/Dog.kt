package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.one

import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.Colors

class Dog() : Animal() {
    override fun makeSound() {
        println("Bark ${Colors.BLUE}")

    }
}