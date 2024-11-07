package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.one

import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.Colors

class Bird : Animal() {
    override fun makeSound() {
        println("${Colors.RED}Tweet ${Colors.RESET}")

    }
}