package org.example.org.akirepko.kotlincourse.lesson16inheritance.homework

open class GeometrivFigure(val name: String, val square: Double) {
}

open class Polygon(
    name: String,
    val sides: Int,
    square: Double,
    val perimetr:Int

) : GeometrivFigure(name, square)

class Circle(
    name: String,
    val radiuss: Double,
    square: Double

) : GeometrivFigure(name, square)

class Triangle(
    name: String,
    square: Double,
    perimetr: Int

)