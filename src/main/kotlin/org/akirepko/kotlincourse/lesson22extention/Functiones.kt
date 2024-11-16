package org.example.org.akirepko.kotlincourse.lesson21extention

import org.example.org.akirepko.kotlincourse.lesson11.searchKey

fun String.removeSpaces(): String {
    return replace(" ", "")
}

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}

fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()
    println("string".funA(1, "sd"))

    listOf(1, 2, 3).funB(null)

    mapOf(1 to "", 2 to "ss").funC(1, "")
    val x = 23.1
    println(x.funD(2.0, null))

    println(setOf(1, 2, 3, 4).funE(1))
    println(5.3333.format())

    val stroka = "aa aww afddsaf asf"

    stroka.split(" ").size

    val myNum = 123
    val myList = listOf(myNum, myNum)

}

fun String.funA(a: Int, B: String): Boolean = true

fun List<Int>.funB(arg: String?) {}

fun <K, V> Map<K, V>.funC(a: K, b: V): Boolean = true

fun Double.funD(a: Double, b: String?): Double = 0.0

fun <T> Set<T>.funE(a: T): List<T> = listOf()

fun String.wordcounter(): Int = split(" ").size

fun Double.format(): String {
    return ("%.2f".format(this))
}

fun <T> T.createList(arg: Int):List<T>{
    val range = 0 until arg
    return range.map { this }
}