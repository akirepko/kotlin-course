package org.example.org.akirepko.kotlincourse.lesson23.homework
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.
//Задача 2
//Создайте функцию safeCastToList, принимающую параметр
// типа Any и возвращающую размер списка, если аргумент можно
// безопасно привести к типу List. В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.
//Задача 3
//Создайте функцию getStringLengthOrZero,
// которая принимает параметр типа Any? и возвращает длину строки, если аргумент можно привести к типу String.
// В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.
//Задача 4
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”)
// и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат,
// если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.


fun analyzeDataType(item: Any) {
    when (item) {
        is String -> println("Это строка: $item")
        is Int -> println("Это целое число: $item ")
        is List<*> -> println("Это список, количество элементов: ${item.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${item.size}")
        else -> println("Неизвестный тип данных")
    }
}

fun sumIntOrDoubleValues(values: List<Any?>): Double {
    return values.map {
        when (it){
            is Int -> it.toDouble()
            is Double -> it
            else-> 0.0}
    }.sum()

}

fun safeCastToList(item: Any): Int {
    return ((item as? List<*>)?.size ?: -1)

}

fun getStringLengthOrZero(item: Any): Int {
    return ((item as? String)?.length ?: 0)

}

fun squreStringandDouble(item: Any): Double {
    return when (item) {
        is Int -> item.toDouble() * item.toDouble()
        is Double -> item * item
        is String -> item.toDouble() * item.toDouble()
        else -> 0.0
    }


}


fun main() {

}