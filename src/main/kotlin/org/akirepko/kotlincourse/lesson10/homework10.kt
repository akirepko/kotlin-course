package org.example.org.akirepko.kotlincourse.lesson10

fun main() {
//    Задание 1: Создание и Инициализация Массива

    val myArray = arrayOf(1, 2, 3, 4, 5)
    println(myArray)
//    Задание 2: Создание Пустого Массива
    val myEmptyArray = Array(10) { " " }
    println(myEmptyArray)
//    Задание 3: Заполнение Массива в Цикле
    val myDouble = Array(5) { 0.0 }

    for (i in myDouble.indices) {
        myDouble[i] = i.toDouble() * 2
    }
    println(myDouble.toList())
//    задание 4: Изменение Элементов Массива
//    Создайте массив из 5 элементов типа Int.
//    Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val myInt = Array(5) { 0 }

    for (i in myDouble.indices) {
        myDouble[i] = i.toDouble() * 3
    }
    println(myInt.toList())

//    Задание 5: Работа с Nullable Элементами
//    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val emptyNullableArray = arrayOf(null, "sss", "ssss")


//    Задание 6: Копирование Массива
//    Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val myFavoriteArray = arrayOf(1, 2, 3, 4, 5)
    val myBestArray = Array<Int>(5) { 0 }
    for (i in myBestArray.indices) {
        myBestArray[i] = myFavoriteArray[i]
    }
    println(myBestArray.toList())


//    Задание 7: Разница Двух Массивов
//    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val myLovingArray = arrayOf(1, 2, 3, 4, 5)
    val myLovingArrayTwo = arrayOf(5, 4, 3, 2, 1)
    val myLovingArrayThree = Array<Int>(5) { 0 }
    for (i in myLovingArrayThree.indices) {
        myLovingArrayThree[i] = myLovingArrayTwo[i] - myLovingArray[i]
    }
    println(myLovingArrayThree.toList())


//    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел. Найдите индекс элемента со значением 5.
////    Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
//    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
//    var index = 0
//    var foundIndex = -1
//    for(i in  numbers.indices) {
//            index+1
//        }
//    println(index)
//
////    while (index < numbers.size) {
////        if (numbers[index] == 5) {
////            foundIndex = index
////            break // Выходим из цикла, если нашли элемент
////        }
////        index++
////    }
//    println(foundIndex)
////    Задание 9: Перебор Массива
//    Создайте массив целых чисел.
//    Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//    Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
//    val myNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
//    for (i in myNumbers.indices){
//
//    }
//    Задание 10: Поиск Значения в Массиве по вхождению
//    Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.


}