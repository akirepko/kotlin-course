package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.one

import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.Colors

class Cat : Animal() {
    override fun makeSound() {
        println("Meow \u001B[33m")

    }
}