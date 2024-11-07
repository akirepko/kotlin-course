package org.example.org.akirepko.kotlincourse.lesson18Inkapsulation

class Lampe {
    private var isOn = false

    fun turnOn() {
        isOn = true
        println("Лампа включена")
    }

    fun turnOff() {
        isOn = false
        println("Лампа выключена")
    }


}