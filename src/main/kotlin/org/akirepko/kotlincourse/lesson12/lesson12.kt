package org.example.org.akirepko.kotlincourse.lesson12

fun main() {

}

fun sayHello() {
    println("Zdorovo")
}

fun greetUser(name: String) {
    println("Zdorovo $name")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

fun doSomthing() {}
fun doSum() = Unit

fun getUserName(): String {
    return ""
}

fun printHreeting(greting: String) {}
fun calCulateAre(weight: Double, height: Double): Double {
    return 0.0
}

fun findMax(ch: Int, ch2: Int): Int {
    return 0
}

fun isNullorEmpty(name: String?): Boolean {
    return false
}

fun calculateDiscount1(names: List<String>, arg: Int?): Double? {
    return null
}

fun sum(first: Double, sec: Double, flag: Boolean): Double {
    return if (flag) {
        first + sec
    } else {
        first - sec
    }
}

fun getmax(oneInt: Int, twoInt: Int) = if (oneInt > twoInt) oneInt else twoInt

fun printPositiveNumbers(mylist: List<Int>) {
    for (i in mylist) {
        if (i > 0) {
            println(i)
        } else return
    }
}

fun replaceString(listString:MutableList<String>,str:String){
    for ( i in listString.indices){
        if (listString[i]==str){
            listString[i]=str.uppercase()
            return
        }
    }
}

private fun checkSize(number:Int, myString:String){
    if (number == 0) throw IllegalArgumentException("$myString не должно быть равным нулю")
}

private fun createRange(weight:Int):IntProgression {
     return if (weight > 0) {
        0..weight
    } else {
        0 downTo weight
    }
}

fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize,"xSize")
    checkSize(ySize,"ySize")

    val formatterSize = " $xSize".length
    val xRange = createRange (xSize )
    val yRange = createRange (ySize )
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}

