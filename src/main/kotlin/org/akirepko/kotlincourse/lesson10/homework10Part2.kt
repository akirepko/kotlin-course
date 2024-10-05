package org.example.org.akirepko.kotlincourse.lesson10

fun main() {
//    Задание 1: Создание Пустого Списка
//    Создайте пустой неизменяемый список целых чисел.
    val myList = listOf<Int>()
//    Задание 2: Создание и Инициализация Списка
//    Создайте неизменяемый список строк, содержащий три элемента
//    (например, "Hello", "World", "Kotlin").
    val myStringList = listOf("Hello", "World", "Kotlin")

//    Задание 3: Создание Изменяемого Списка
//    Создайте изменяемый список целых чисел и инициализируйте
//    его значениями от 1 до 5.
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
//    Задание 4: Добавление Элементов в Список
//    Имея изменяемый список целых чисел,
//    добавьте в него новые элементы (например, 6, 7, 8).

    myMutableList.add(6)
    myMutableList.add(7)
    myMutableList.add(8)
//    Задание 5: Удаление Элементов из Списка
//    Имея изменяемый список строк,
//    удалите из него определенный элемент (например, "World").
    val myNewStringList = mutableListOf("Hello", "World", "Kotlin")
    myNewStringList.remove("World")
//    Задание 6: Перебор Списка в Цикле
//    Создайте список целых чисел и используйте
//    цикл для вывода каждого элемента на экран.
    for (i in myMutableList) {
        println(i)
    }

//    Задание 7: Получение Элементов Списка по Индексу
//    Создайте список строк и получите из него второй элемент,
//    используя его индекс.
    println(myNewStringList[1])
//    Задание 8: Перезапись Элементов Списка по Индексу
//    Имея изменяемый список чисел,
//    измените значение элемента на определенной позиции
//    (например, замените элемент на позиции 2 на новое значение)
    myMutableList.add(2, 77)
    myMutableList.remove(3)
    println(myMutableList)
//    Задание 9: Объединение Двух Списков
//    Создайте два списка строк и объедините их в один новый список,
//    содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val myStringOne = mutableListOf("af", "adfd", "fdf")
    val myStringTwo = mutableListOf("azzxff", "adfzfd", "fsdfdf")
    val myNewString = mutableListOf<String>()
    for (i in myStringOne) {
        myNewString.add(i)
    }
    for (i in myStringTwo) {
        myNewString.add(i)
    }
    println(myNewString)
//    Задание 10: Нахождение Минимального/Максимального Элемента
//    Создайте список целых чисел и найдите в нем
//    минимальный и максимальный элементы используя цикл.
    val myTestList = mutableListOf(1, 2, 3, 4, 5)
    var min = 0
    var max = 0
    for (i in myTestList) {
        when {
            i > max -> max = i
            i < max -> max = max
            i < min -> min = min
            i > min -> min = i
        }
    }
    println(min)
    println(max)
//    Задание 11: Фильтрация Списка
//    Имея список целых чисел, создайте новый список,
//    содержащий только четные числа из исходного списка используя цикл.
    val newMutableList = mutableListOf<Int>()
    for (i in myTestList) {
        if (i%2==0){
            newMutableList.add(i)
        }

    }
println(newMutableList)
//
}