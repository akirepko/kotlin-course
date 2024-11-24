package org.example.org.akirepko.kotlincourse.lesson24Exeption

import java.io.File
import java.lang.ClassCastException
import java.lang.RuntimeException

fun main() {

//    try {
//        // Код, который может выбросить исключение
//    } catch (e: NullPointerException) {
//        // Обработка конкретного типа исключения
//    } catch (e: Exception) {
//        // Обработка всех остальных исключений
//    } finally {
//        // Блок, который выполняется всегда, независимо от наличия исключения
//    }
//
//    try {
//        // Код, который может выбросить исключения
//    } catch (e: Exception) {
//        when(e) {
//            is ExceptionA, is ExceptionB -> {
//                // Обработка исключений ExceptionA или ExceptionB
//                println("Обработано исключение типа A или B")
//            }
//            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//        }
//    }

//    val myExeption = "afassd" as Double
//    try {
//        val myExeption = "afassd" as Double
//    } catch (e: ClassCastException){
//        println("ClassCastException")
//    }


//    setAge(-2)
//    val file = File("sxfdsf")
////    println(file.readText())
//    file.createNewFile()
//    val i = file.inputStream()
//    i.close()
//    i.read()

//    val myList= mutableListOf("")
//    try {
//        while (true) {
//            myList.add("afassfa")
//        }
//    }catch (e: Throwable){
//        println("память жок")
//    }
    try {
        stack()
    } catch (e: Throwable) {
        println("рекурсия")
    }


}

fun setAge(age: Int) {
    check(age >= 0) {
        "Слишком молод"
    }
}

fun stack() {
    stack()
}

class OrderExeption(message: String) : RuntimeException(message) {
    
}