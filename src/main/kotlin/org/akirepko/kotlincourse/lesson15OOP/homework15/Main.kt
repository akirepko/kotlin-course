package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15

fun main(){
 val myParty=Party("Tula",12)
    myParty.details()
    Moon.showPhase()

    val myConcert =Concert(mutableListOf("КИШ","Цой"),"Москва", 12.0, 123)
    myConcert.buyTickets()

}