package org.example.org.akirepko.kotlincourse.lesson11

fun main() {

    val pair: Pair<Int, String> = 1 to "t"
    val pair2 = Pair(2, "B")


    println(pair.first)
    println(pair.second)
    val emptyMap: Map<String, String> = mapOf<String, String>()

    val capitals: Map<Int, String> = mapOf(1 to "f", 2 to "b")

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")
    val capitalOfRussia = mutableCapitals["Россия"]

    println(capitalOfRussia)

    mutableCapitals["Germany"] = "Berlin"
    mutableCapitals.put("Германия", "Берлин")
    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country: $capital")


    }

    val myMap = mapOf<String, Int>()
    val myLovingMap = mapOf(1 to "a", 2 to "b")
    val myFavoriteMap: MutableMap<Int, String> = mutableMapOf(1 to "a")

    myFavoriteMap[34] = "asf"

    println(myFavoriteMap[1])
    println(myFavoriteMap[555])
    myFavoriteMap.remove(34)

    for (enteries in myLovingMap) {
        println("${enteries.key}:${enteries.value}")
    }

    for ((key, value) in myLovingMap) {
        println("$key : $value")
    }

    val myOneMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 4))

   val daysMap= mapOf<String,List<String>>()
    val mapYears= mapOf<String, MutableMap<String, String>>()
    val mutableMapOfGame= mapOf<String, MutableSet<String> >()


}

fun searchKey(myMap:Map<String,String>, word:String):String {
    for((key, value) in myMap){
        if (value==word) return key

    }
    return "Цой жив "
}