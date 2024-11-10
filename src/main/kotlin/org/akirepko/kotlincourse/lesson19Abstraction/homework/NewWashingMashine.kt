package org.example.org.akirepko.kotlincourse.lesson19Abstraction.homework

class NewWashingMashine : IncludedEqupiment(), Programmable, WaterConnection, Drainable, Cleanable, Mechanical {
    override fun programAction(action: String) {
        println("Скажи что делать $action")
    }

    override fun execute() {
        println("Закончили упражнение")
    }

    override fun connectToWaterSupply() {
        println("подключили воду")
    }

    override fun getWater(amount: Int) {
        println("Набролось воды $amount")
    }

    override fun connectToDrain() {
        println("Подключили к канализцации")
    }

    override fun drain() {
       println("Слив")
    }

    override fun clean() {
        println("Чистка")
    }

    override fun performMechanicalAction() {
        println("Машинка делает врум врум")
    }


}