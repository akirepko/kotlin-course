package org.example.org.akirepko.kotlincourse.lesson13

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    if (numbers.size > 5) {
        println("ok")
    }

    numbers.isEmpty()
    numbers.isNotEmpty()
    val defaultValue = numbers.getOrElse(8) { "пупупу" }

    val militaryArmy = listOf(17, 18, 28, 11, 69, 33)

    println(militaryArmy.filter {it in 18..30  })

}