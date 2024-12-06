package org.example.org.akirepko.kotlincourse.lesson26.homework
/*
Задания на отработку синтаксиса
Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
Создайте функцию, принимающую функцию с аргументом типа String и
 возвращающую другую функцию, принимающую Int и возвращающую Boolean.
Напишите функцию, которая принимает список чисел, множество строк,
функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.
Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку
Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.

*/

fun something(some: () -> Unit) {}

fun funA(arg: (Int) -> String) {}

fun funB(arg: Int.(String) -> Boolean) {}

fun funC(arg: (Double, Double) -> Boolean) {}

fun <T> funD(arg: (T) -> List<T>) {}

fun funE(arg: (String) -> ((Int) -> Boolean)) {}

fun funF(
    list: List<Int>,
    set: Set<String>,
    myFun: (List<Int>, Set<String>) -> Map<String, Int>
) {
}

fun funG(
    num: Int,
    funString: (Int) -> String
): String {
    return funString(num)
}

fun funH(
    arg: (() -> Unit) -> Unit
) {
}