package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15

object Moon {
    private var isVisible = true
    private var phase = listOf("Full Moon","New Moon")

    fun  showPhase(){
        if (this.isVisible){
            println(this.phase[0])
        }
        else{
            println(this.phase[1])
        }
    }
}