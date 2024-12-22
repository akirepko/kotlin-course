package org.example.org.akirepko.kotlincourse.lesson30.homework

enum class RealEstate(val type: String) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    STUDIO("Студия"),
    ROOM("Комната"),
    LOFT("Лофт");

    fun type(): String {
            return type
    }
}

