package org.example.org.akirepko.kotlincourse.lesson16inheritance.homework

class OfficeFurniture(
    type: String,
    height: Int,
    weight: Int,
    deep: Int,
    val price: Double
) : Furniture(type, height, weight, deep) {
}