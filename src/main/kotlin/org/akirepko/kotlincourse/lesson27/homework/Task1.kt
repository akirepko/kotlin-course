package org.example.org.akirepko.kotlincourse.lesson27.homework



/*Создайте функцию
timeTracker, которая принимает другую функцию в
 качестве аргумента и измеряет время её выполнения.
  Функция timeTracker должна возвращать затраченное время в миллисекундах.
  Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.

Для проверки результата можно выполнить в ней например такой ресурсоёмкий код:

val myFunction = {
    val list = List(10000000) { (0..10000).random() }
    list.sorted()
}*/

fun main(){
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(timeTracker (myFunction)  )
}

fun <T>timeTracker (funA:()->T): String{
    val beforeTime=System.currentTimeMillis()
    funA()
    val afterTime= System.currentTimeMillis()
    return "Время выполнение функции ${afterTime-beforeTime} может даже милисекунд"

}