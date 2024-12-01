package org.example.org.akirepko.kotlincourse.lesson25.homework

//Создай функцию, которая принимает список строк и число,
//а возвращает список из строк, длина которых больше или равна заданному числу.
//Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun main() {
    val family = listOf("мама", "папа", "дочь", "сын")

    val newListOne = fun(strings: List<String>, num: Int): List<String> {
        require(strings.isNotEmpty()) { "Список пуст" }
        return strings.filter { it.length >= num }
    }

    val newNewList: (List<String>, Int) -> List<String> = { strings, num ->
        require(strings.isNotEmpty()) { "Список пуст" }
        strings.filter { it.length >= num }
    }

    val newNewNewList = { strings: List<String>, num: Int ->
        require(strings.isNotEmpty()) { "Список пуст" }
        strings.filter { it.length >= num }
    }

    println(newList(family, 3))
    println(newListOne(family, 3))
    println(newNewList(family, 3))
    println(newNewNewList(family, 4))
}


fun newList(strings: List<String>, num: Int): List<String> {
    require(strings.isNotEmpty()) { "Список пуст" }
    return strings.filter { it.length >= num }
}