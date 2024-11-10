package org.example.org.akirepko.kotlincourse.lesson19Abstraction.homework

abstract class MyEquipment () : TemperatureRegulatable, Openable, ProgrammEqupiment(){
    override fun setTemperature(temp: Int) {
        println("температура - $temp")
    }

    override fun open() {
        println("Открыли")
    }

    override fun close() {
        println("Закрыли")
    }
}