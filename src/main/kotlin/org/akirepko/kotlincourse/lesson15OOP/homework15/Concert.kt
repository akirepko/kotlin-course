package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15

class Concert(
    val gruppe: MutableList<String>,
    val location: String,
    val price: Double,
    val capacity: Int
) {
    private var soldTickets = 0

    fun buyTickets() {
        while (soldTickets < capacity){
            soldTickets++
        }
        println(soldTickets)
    }
}