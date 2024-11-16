package org.example.org.akirepko.kotlincourse.lesson22extention.homework

import org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions.pairNumber
import org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions.stringReturn
import org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions.turnPair

fun main() {
    val myArray = arrayOf(1, 2, 3, 4)
    println(myArray.pairNumber())
    val myMap= mapOf(1 to listOf(1, 2), 2 to listOf(2, 1))
    println(myMap)
    val numL3:Long=1234567890123L
    println(numL3.stringReturn())
    val myPair=myArray.pairNumber()
    println(myPair.turnPair())

}