package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15

class Party(val location: String, var attendees: Int) {
    fun details() {
        println("Мы будем в  $location нас будет$attendees")
    }
}