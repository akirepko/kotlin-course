package org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions

import kotlin.math.absoluteValue

fun Number.within(other: Number, deviation: Number): Boolean{
    val difference = this.toDouble() - other.toDouble()
    return difference.absoluteValue <= deviation.toDouble()
}