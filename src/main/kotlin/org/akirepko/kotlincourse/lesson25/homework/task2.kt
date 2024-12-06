package org.example.org.akirepko.kotlincourse.lesson25.homework

//Задание 2. Создай функцию,
// которая принимает список чисел и возвращает среднее арифметическое этого списка.
// С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).
fun main() {
    val numbers = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val avgFun = fun(list: List<Double>): Double {
        require(list.isNotEmpty())
        return list.sum() / list.size
    }

    val avgLyambda: (List<Double>)->Double ={
        require(it.isNotEmpty())
         it.sum() / it.size
    }

    val avgWithoutarg = { list: List<Double> ->
        require(list.isNotEmpty())
        list.sum() / list.size
    }
    println(avgList(numbers))
    println(avgFun(numbers))
    println(avgLyambda(numbers))
    println(avgWithoutarg(numbers))
}


fun avgList(list: List<Double>): Double {
    require(list.isNotEmpty()) { "Список пуст" }
    return list.sum() / list.size
}