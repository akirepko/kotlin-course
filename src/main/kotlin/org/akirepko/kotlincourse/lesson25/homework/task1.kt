package org.example.org.akirepko.kotlincourse.lesson25.homework

//Задание 1. Создай константу в файле с текстом.
// Создай функцию, которая ничего не принимает и не возвращает и печатает в консоль текст константы.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь как функция работает

const val LIFE =
    "ОБЫДЕННОСТЬ"

fun main() {
    val lifeOne = fun() {
        println(LIFE)
    }
    val lifeTwo: () -> Unit = {
        println(LIFE)
    }

    val lifeThree = {
        println(LIFE)
    }

    myLife()
    lifeOne()
    lifeTwo()
    lifeThree()
}

fun myLife() {
    println(LIFE)
}