package org.example.org.akirepko.kotlincourse.lesson10

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    val numbersOne = arrayOf<Int>()

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)
    val readOnlyList: List<String> = listOf("a", "b", "c")
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    val mutablNumberSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    mutableList.add("ui")
    println(readOnlyList[1])
    println(numbersSet)

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println(letter)
    }
    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }
    val numbersPracrtic = Array(10) { 0 }
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val array1 = Array(10) { 0 }
    array1[0] = 10
    for (index in array1.indices) {
        array1[index] = (index + 1) * 10
    }
    println(array1.toList())
    val array2 = arrayOf("q", "2d", "asdf", "asd", "asd")
    for (i in array2.indices) {
        array2[i] = " "
    }
    println(array2.toList())

    val array3 = arrayOf(1, 33, 535)
    val array4 = arrayOf(2, 34, 5445)
    val array5 = Array(3) { 0 }
    for (i in array5.indices) {
        array5[i] = array3[i] + array4[i]
    }
    println(array5.toList())

    val myList = listOf<Int>()

    val stringList = listOf("ffd", "sfdf", "dfsdf")

    var myMutableList = mutableListOf<Float>()
    myMutableList.add(45F)
    myMutableList.add(43F)
    myMutableList.remove(45F)

    val mySet = setOf(0, 1, 2, 3)
    val setnum = setOf<Int>()
    val mmSet = mutableSetOf(1, 2, 3)
    mmSet.add(40)
    mmSet.remove(2)
    println(mmSet)
    for(elem in mmSet){
        println(elem*elem)
    }
 val oneSet=setOf(1,2,3,4)
    val twoSet= setOf(3,5,6)
    val threeSet= mutableSetOf<Int>()
    for (i in oneSet){
        threeSet.add(i)
    }
    for (i in twoSet){
        threeSet.add(i)
    }
    println(threeSet)


}
fun findNumber(setNum:Set<Int>,num:Int): Boolean{
    for (i in setNum){
        if (i==num){
            return true
        }
    }
    return false
}