package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15.fridge

object ItemType {

    const val LIQUIDS = "liquids"
    const val ALCOHOL = "alcohol"
    const val FRUIT = "fruit"
    const val VEGETABLE = "vegetable"
}

val conversionFactors = mapOf(
    ItemType.LIQUIDS to 0.95,
    ItemType.ALCOHOL to 0.8,
    ItemType.FRUIT to 0.65,
    ItemType.VEGETABLE to 0.55
)