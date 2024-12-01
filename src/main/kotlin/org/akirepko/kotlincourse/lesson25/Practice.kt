package org.example.org.akirepko.kotlincourse.lesson25

fun main() {
    val one = fun() {
        println("Hello world")
    }

    val oneone: () -> Unit = { println("Hello world") }
    val oneoneone = { println("Hello world") }

    val two = fun(str: String): Int {
        return str.length
    }
    val twotwo: (String) -> Int = { it -> it.length }

    val twotwotwo = { str: String ->
        str.length

    }

    val reverse = fun String.(a: Int, b: Int): Boolean {
        println(this)
        println(a)
        println(b)
        return a == b
    }


    val myList = fun(myList: List<Int>): Int {
        return myList.filter { it > 0 }.sum()
    }

    val myList1: (List<Int>) -> Int = { list ->
        list.filter { it > 0 }.sum()
    }

    val myList2 = { list: List<Int> ->
        list.filter { it > 0 }.sum()
    }

    val mySet = fun Set<Int>.(): Set<Int> {
        return filter { (it % 2) == 1 }.toSet()
    }

    val mySet1: Set<Int>.() -> Set<Int> = { ->
        filter { it % 2 == 0 }.toSet()
    }
    val setMy = setOf(1, 2, 3, 4)
    println(setMy.mySet1())
   // val generic = fun <T>(arg: T) {} незя

}

val reverseone: String.(Int, Int) -> Boolean = { a, b ->
    println(this)
    println(a)
    println(b)
    a == b
}

fun one() {
    println("Hello world")
}

fun two(str: String): Int {
    return str.length
}

fun String.reverse(a: Int, b: Int): Boolean {
    println(this)
    println(a)
    println(b)
    return a == b
}

fun myfuncton(myList: List<Int>): Int {
    return myList.filter { it > 0 }.sum()
}

fun Set<Int>.filterEven(): Set<Int> {
    return filter { (it % 2) == 1 }.toSet()
}

fun <T> funA(arg: T) {}