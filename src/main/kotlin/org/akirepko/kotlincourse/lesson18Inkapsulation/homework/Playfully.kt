package org.example.org.akirepko.kotlincourse.lesson18Inkapsulation.homework

//Опиши схематически класс игрового автомата, правильно расставив объявление
//полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
//
//Поля:
//цвет
//модель
//включен
//ОС загружена
//список доступных игр
//наличие джойстика
//баланс вырученных средств
//владелец
//телефон поддержки.
//
//Методы:
//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//открыть сейф и выдать наличные
//выплатить выигрыш


class Playfully {
    var color = ""
    val model = ""
     private var isOn = true
    private var statusOs = true
    val listGame = listOf<String>()
    val isGamepad = true
    private var balance = 0.0
    private var owner = ""
    private var number = ""
    private var winCash = 0

    fun turnOn() {
        isOn = true
        downladOs()
    }

    fun turnOff() {
        isOn = false
        turnOffOs()
    }

    private fun downladOs() {
        statusOs = true
    }

    private fun turnOffOs() {
        statusOs = false
    }

    fun showGames(): List<String> {
        return this.listGame

    }

    fun turnOnGame(listGame: List<String>) {
        showGames()[0]
    }

    fun payGame() {
        balance++
    }
    fun openSafeGetCash(){}

    private fun cash(balance: Int) {
        balance-winCash

    }



}