package org.example.org.akirepko.kotlincourse.lesson15OOP

class Wind(val speed: Int) {
    fun convertSpeed():Int{
        return speed*1000/3600
    }
}