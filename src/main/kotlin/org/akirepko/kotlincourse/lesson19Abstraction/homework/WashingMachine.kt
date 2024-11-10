package org.example.org.akirepko.kotlincourse.lesson19Abstraction.homework

abstract class WashingMachine : Powerable, Openable,
    WaterContainer, TemperatureRegulatable, WaterConnection, Drainable, Cleanable, Mechanical, AutomaticShutdown {
}