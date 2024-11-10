package org.example.org.akirepko.kotlincourse.lesson19Abstraction

import java.io.InputStream

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getCapacity(): Double
    fun recharge()
}

//class ElectricKettler(override val applianceType: String) : HouseholdAppliance(""), TemperatureRegulatable, AutomaticShutdown, WaterStorable,  Openable{
//    override val maxTemperature: Int
//        get() = TODO("Not yet implemented")
//
//    override fun setTemperature(temp: Int) {
//        TODO("Not yet implemented")
//    }
//
//    override val sensorType: String
//        get() = TODO("Not yet implemented")
//    override val maxSensoredValue: Int
//        get() = TODO("Not yet implemented")
//
//    override fun startMonitoring() {
//        TODO("Not yet implemented")
//    }
//
//    override val volume: Int
//        get() = TODO("Not yet implemented")
//
//    override fun fill(amount: Int) {
//        TODO("Not yet implemented")
//    }
//
//    override fun take(amount: Int) {
//        TODO("Not yet implemented")
//    }
//
//
//    override fun open() {
//        TODO("Not yet implemented")
//    }
//
//    override fun close() {
//        TODO("Not yet implemented")
//    }
//
//    override fun operate() {
//        TODO("Not yet implemented")
//    }
//
//    override fun powerOff() {
//        TODO("Not yet implemented")
//    }
//
//}