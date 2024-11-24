package org.example.org.akirepko.kotlincourse.lesson24Exeption.homework
//Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//NullPointerException
//ArrayIndexOutOfBoundsException
//ClassCastException
//NumberFormatException
//IllegalArgumentException
//IllegalStateException
//OutOfMemoryError
//StackOverflowError
//
//Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок
//
//Задание 3. Оберни все вызовы из предыдущего задания в блок try-catch с одним блоком catch для любого типа исключений.
// Внутри блока catch, используя when, напиши для каждого исключения вывод в консоль специфического сообщения,
// подходящего под каждый из типов.
//
//Задание 4. Создай свой тип исключения в отдельном файле,
// наследуемый от AssertionError и принимающий текст. Выброси это исключение в main
//
//Задание 5. Создай свой тип исключения в отдельном файле,
// наследуемый от RuntimeException и принимающий ArrayIndexOutOfBoundsException тип в качестве аргумента.
// Напиши код, который спровоцирует выброс ArrayIndexOutOfBoundsException,
// перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.

fun main() {
//    val myNull = null
//    a!!
//    val myArray = arrayOf(1)
//    myArray[2]
//    val myString = "sdsd" as Double
//    val myStringToDouble = "sddfd".toDouble()
//      illegalArgument(-1)
//    setAge(-1)
//    val myList= mutableListOf("")
//    while (true) {
//        myList.add("afassfa")
//    }
//
//stack()

//    try {
//        val myNull = null
//        myNull!!
//    } catch (e: NullPointerException) {
//        println("Все же это был null")
//    }
//
//    try {
//        val myArray = arrayOf(1)
//        myArray[2]
//    } catch (e: ArrayIndexOutOfBoundsException) {
//        println("Массивы не бесконечны")
//    }
//
//    try {
//        val myString = "sdsd" as Double
//    } catch (e: ClassCastException) {
//        println("Это разные классы")
//    }
//
//    try {
//        val myStringToDouble = "sddfd".toDouble()
//    } catch (e: NumberFormatException) {
//        println("Не все строки цифры")
//    }
//
//    try {
//        illegalArgument(-1)
//    } catch (e: IllegalArgumentException) {
//        println("Спросить про рекваер")
//    }
//
//    try {
//        setAge(-1)
//    } catch (e: IllegalStateException) {
//        println("Это минус")
//    }
//
//    try {
//        val myList= mutableListOf("")
//    while (true) {
//        myList.add("afassfa")
//    }
//    } catch (e: OutOfMemoryError) {
//        println("ПАМЯТЬ НЕ БЕСКОНЕЧНА")
//    }
//
//    try {
//       stack()
//    } catch (e: StackOverflowError) {
//        println("Рекурсивненько")
//    }
//

    try {
        val myNull = null
        myNull!!
//        val myArray = arrayOf(1)
//        myArray[2]
//        val myString = "sdsd" as Double
//        val myStringToDouble = "sddfd".toDouble()
//        illegalArgument(-1)
//        setAge(-1)
//        val myList = mutableListOf("")
//        while (true) {
//            myList.add("afassfa")
//        }
//        stack()
    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> println("Все же это был null")
            is ArrayIndexOutOfBoundsException -> println("Массивы не бесконечны")
            is ClassCastException -> println("Это разные классы")
            is NumberFormatException -> println("Не все строки цифры")
            is IllegalArgumentException -> println("Спросить про рекваер")
            is IllegalStateException -> println("Это минус")
            is OutOfMemoryError -> println("ПАМЯТЬ НЕ БЕСКОНЕЧНА")
            is StackOverflowError -> println("Рекурсивненько")
            else -> println("Другой экспешн")


        }
    }

//    throw HomeExeption("Новое исключение")


    val array = arrayOf(1, 2, 3)

    try {

        array[5]
    } catch (e: ArrayIndexOutOfBoundsException) {


        try {
            throw NewHomeworkExeption(e)
        } catch (e: NewHomeworkExeption) {
            println("Новое новое исключенbt")
        }


    }


}

fun illegalArgument(item: Int) {
    require(item > 0)
}

fun setAge(age: Int) {
    check(age >= 0) {
        "Слишком молод"
    }
}

fun stack() {
    stack()
}