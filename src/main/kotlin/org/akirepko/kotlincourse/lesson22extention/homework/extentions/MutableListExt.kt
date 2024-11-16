package org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions

fun <T> MutableList<T?>.getOrNull(number: Int, generic: T): T?{ return this[number]}