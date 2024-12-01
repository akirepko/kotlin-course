package org.example.org.akirepko.kotlincourse.lesson25.homework

//Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun main(){
    val listInt = listOf(1, 6, 2, 4, 3, 4, 1)
    val listDouble = listOf(1.1, 2.2, 2.2, 3.4, 3.1, 4.1, 5.2, 5.2)

    val myUnique = fun List<Number>.() : List<Number>{
        return toSet().toList()
    }

    val myUniqueOne: List<Number>.()->  List<Number> = {
        toSet().toList()
    }

    println(listInt.uniqueNumbers())
    println(listDouble.uniqueNumbers())
    println(listInt.myUnique())
    println(listDouble.myUnique())
    println(listInt.myUniqueOne())
    println(listDouble.myUniqueOne())
}


fun List<Number>.uniqueNumbers(): List<Number>{
    return toSet().toList()
}