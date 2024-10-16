package org.example.org.akirepko.kotlincourse.lesson12

fun main() {
    println(myAvg(listOf(1, 2, 3)))
    println(isEven(55))
    printNumbersUntil(33)
    println(findFirstNegative(listOf(1, -2, 2, 4, 5)))
    processList(listOf("ads", "adasdd", null, "asdf"))
    drawRectangle(6, 7)

}

//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun funMethod() {}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun mySum(a: Int, b: Int) = a + b

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun myString(string: String) {}

//Напишите сигнатуру функции, которая принимает список целых чисел
// и возвращает среднее значение типа Double.
fun myAvg(numbers: List<Int>): Double {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result / numbers.size.toDouble()
}

//Напишите сигнатуру функции,
// которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun weightString(string: String?): Int? {
    return null
}

//Напишите сигнатуру функции,
// которая не принимает аргументов и возвращает nullable вещественное число.
fun thingNumber(): Double? {
    return null
}

//Напишите сигнатуру функции,
// которая принимает nullable список целых чисел и не возвращает значения.
fun listNumbers(numbers: List<Int?>) {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun someMethod(number: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun listMethod(): List<String?> {
    return listOf(null)
}

//Напишите сигнатуру функции, которая принимает nullable
// строку и nullable целое число и возвращает nullable булево значение.
fun nullableBollean(string: String?, number: Int?): Boolean? {
    return null
}

//
//Напиши рабочий код для следующих задач:
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и
// возвращает true, если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

//
//Задача 3:
//Напишите функцию printNumbersUntil,
// которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1,
// функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(number: Int) {
    if (number < 1) return

    for (i in 1..number) {
        println(i)
    }

}

//Задача 4:
//Создайте функцию findFirstNegative,
// которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (i in numbers) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return
// без возврата значения.
fun processList(strings: List<String?>) {
    for (i in strings)
        if (i != null) {
            println(i)

        } else return
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//
//Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.
//
private fun checkSide(side: Int, name: String) {
    if (side <= 0) throw IllegalArgumentException("$name должно быть положительным и больше нуля")
}

private fun borderLine(side: Int, symbolCorner: String, symbolBorder: String) {
    var Line = symbolCorner
    for (i in 1 until side - 1) {
        Line += symbolBorder
    }
    Line += "$symbolCorner\n"
    print(Line)
}

fun drawRectangle(width: Int, height: Int) {
    checkSide(width, "width")
    checkSide(height, "height")

    // Верхняя граница
    borderLine(width, "+", "-")

    // Боковые границы
    for (i in 1 until height - 1) {
        borderLine(width, "|", " ")

    }

    // Нижняя граница
    borderLine(width, "+", "-")
}
//
//
//
//
