package org.example.org.akirepko.kotlincourse.lesson15OOP

class Lampe(var isOn: Boolean) {
    fun switch() {
        isOn = !isOn
        println(isOn)
    }
}