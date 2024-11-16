package org.example.org.akirepko.kotlincourse.lesson16inheritance.homework

class KitchenFurniture(
    type: String,
    height: Int,
    weight: Int,
    deep: Int,
    val moistureResistance: Boolean
) : Furniture(type, height, weight, deep) {
}