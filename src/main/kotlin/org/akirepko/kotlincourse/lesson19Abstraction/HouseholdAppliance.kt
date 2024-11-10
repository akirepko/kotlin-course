package org.example.org.akirepko.kotlincourse.lesson19Abstraction

abstract class HouseholdAppliance(val brand: String) : Powerable {

    abstract val applianceType: String

    var isPoweredOn: Boolean = false
        private set

    abstract fun operate()

    override fun powerOn() {
        isPoweredOn = true
        println("$applianceType от $brand включено.")
        onPowerChange()
    }

//     fun powerOff() {
//        isPoweredOn = false
//        println("$applianceType от $brand выключено.")
//        onPowerChange()
//    }

    private fun onPowerChange() {
        if (isPoweredOn) {
            println("Устройство готово к работе.")
        } else {
            println("Устройство выключено.")
        }
    }


    protected open fun performMaintenance() {
        println("Выполняется обслуживание $applianceType от $brand.")
    }
}

class Microwave(brand: String) : HouseholdAppliance(brand) {
    override val applianceType: String = "Микроволновая печь"

    override fun operate() {
        if (isPoweredOn) {
            println("Готовим еду в микроволновке от $brand.")
            performMaintenance()
        } else {
            println("Микроволновая печь от $brand не включена. Пожалуйста, включите ее.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Чистка микроволновой печи от $brand.")
    }

    override fun powerOff() {
        println("Выкл")
    }
}

fun main() {
    val microwave = Microwave("Lada")
    microwave.powerOn()
    microwave.operate()

}