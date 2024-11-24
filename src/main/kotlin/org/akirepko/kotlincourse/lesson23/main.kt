package org.example.org.akirepko.kotlincourse.lesson23

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Drivable, Flyable {
    override fun drive() {
        println("Едет как автомобиль")
    }

    override fun fly() {
        println("Летит как самолёт")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()

    if (drivable is Flyable) {
        println("Этот объект также может летать!")
        drivable.fly()
    } else {
        println("Этот объект не может летать.")
    }
}

val i: Any = "sdd"

val x = i as String

fun main() {
    val obj: Any = "Hello, World!"

    if (obj is String) {
        println("Объект является строкой")
    }

    if (obj !is Int) {
        println("Объект не является целым числом")
    }
    if (obj is String) {
        // obj автоматически приведён к String
        println(obj.toUpperCase()) // Метод toUpperCase() доступен, т.к. obj теперь String
    }
    val num: Any = 123
    val str: String = num as String

    val safeStr: String? = num as? String

    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)

    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }
    }
    val flyingCar = FlyingCar()

    checkCapabilities(flyingCar)


    println(i as Int)

    if (i is String) {
        println(i)
    } else {
        println("Не строка")
    }

    if (i is Int) {
        println(i)
    } else {
        println("Не число")
    }
    println( i as? Int ?: "Не номер")


    val j: Any = listOf("sdsd","sdsd","asdasd")
    println(j as List<Int>)

    if (j is List<*>){
        (j[0] as String).length
    }
 val x: String? =null
    println(x as? String)



}





