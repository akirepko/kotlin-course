package org.example.org.akirepko.kotlincourse.lesson25.homework

//Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()
fun main() {
    val bigNumber = 123456789123456789L

    val myStrange = fun(number: Long): Int {
        return number.toString().map { it.digitToInt() }.sum()
    }

    val yourStrange: (Long) -> Int = { number ->
        number.toString().map { it.digitToInt() }.sum()
    }

    val herStrange = { number: Long ->
            number.toString().map { it.digitToInt() }.sum()
        }

    println(strangeFun(bigNumber))
    println(myStrange(bigNumber))
    println(yourStrange(bigNumber))
    println(herStrange(bigNumber))
}

fun strangeFun(number: Long): Int {
    return number.toString().map { it.digitToInt() }.sum()
}