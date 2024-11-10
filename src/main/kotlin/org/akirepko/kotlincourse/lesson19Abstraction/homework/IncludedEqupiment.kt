package org.example.org.akirepko.kotlincourse.lesson19Abstraction.homework

abstract class IncludedEqupiment :Powerable {
    override fun powerOn() {
        println("Оно работает")
    }

    override fun powerOff() {
     println("Оно не работает")
    }
}