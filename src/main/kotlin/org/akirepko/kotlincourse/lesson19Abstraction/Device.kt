package org.example.org.akirepko.kotlincourse.lesson19Abstraction

interface Device {
    // Константа, определенная в companion object
    companion object {
        const val DEVICE_TYPE = "Generic Device"
    }

    // Абстрактное свойство (поле), которое должно быть переопределено в классе, реализующем интерфейс
    val deviceId: String

    // Абстрактные методы без реализации
    fun turnOn()
    fun turnOff()

    // Метод с реализацией, вызывающий приватный метод
    fun restart() {
        turnOff()
        logAction("Устройство с ID $deviceId выключено для перезагрузки.")
        turnOn()
        logAction("Устройство с ID $deviceId включено после перезагрузки.")
    }

    // Приватный метод с реализацией (доступно начиная с Kotlin 1.4)
    private fun logAction(action: String) {
        println("Лог действия устройства: $action")
    }
}

class Notebook : Device{
    override val deviceId: String=""

    override fun turnOn() {
        println("Вкл")
    }

    override fun turnOff() {
        println("Выкл")
    }

}