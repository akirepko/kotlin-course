package org.example.org.akirepko.kotlincourse.lesson30

import java.lang.IllegalArgumentException

object NumsObject {

    const val ONE = "ONE"
    const val TWO = "TWO"
    const val THREE = "THREE"
}

enum class Nums {
    ONE,
    TWO,
    THREE
}

fun main() {
    val t = Nums.ONE
    println(Nums.ONE)
    for (n in Nums.entries) {
        println(n)
    }
    DayOfWeek.MONDAY.printDayType()
    Seasons.WINTER.informationAboutSeason()

    println(Seasons.detektedSeason("December"))

    HomeDevices.FRIDGE.action()
}

fun printNum(num: Nums) {
    when (num) {
        Nums.ONE -> println(1)
        Nums.TWO -> println(2)
        Nums.THREE -> println(3)
    }
}

enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun printDayType() {
        if (isWeekend) println("$name is a weekend")
        else println("$name is a weekday")
    }
}

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0);

    fun description() =
        "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

enum class Seasons(val firstMonthName: String, val isVolatileDuration: Boolean = false) {
    WINTER("December", true),
    SPRING("March"),
    AUTUMN("September"),
    SUMMER("June");

    fun informationAboutSeason() {
        println("In $this  first month $firstMonthName season is  ${if (isVolatileDuration) "volatile duration" else " not volatile duration"}")
    }

    companion object {
        fun detektedSeason(month: String): Seasons {
            return entries.firstOrNull { it.firstMonthName == month } ?: throw IllegalArgumentException("wrong month")


        }
    }
}

interface HasValue {

    val value: String

}

interface HasAction {
    fun action()
}

enum class HomeDevices(override val value: String) : HasValue, HasAction {
    FRIDGE("Fridge") {
        override fun action() {
            println("fridgre")
        }
    },
    WASHINGMACHINE("Washing machine") {
        override fun action() {
           println("washing")
        }
    },
    TV("Tv") {
        override fun action() {
            println("turning on")
        }
    },

}