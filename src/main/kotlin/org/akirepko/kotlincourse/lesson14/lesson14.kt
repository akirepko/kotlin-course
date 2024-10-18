package org.example.org.akirepko.kotlincourse.lesson14

fun main() {
    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }
    for ((fruit, price) in fruitsPrices) {
        println("Key: $fruit, Value: $price")
    }
    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values

//получение данных
    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") {
        throw IllegalArgumentException()
    }
    val priceOfApple = fruitsPrices.getValue("apple")
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

//    Изменения словаря
    val fruitsWithoutBanana = fruitsPrices - "banana"
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5)
    val mutableFruits = fruitsPrices.toMutableMap()

    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear()

    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }//все логическая и
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }//любой логическая или

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }// меняет значения но можно и  брать ключи
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }//менеят ключи но можно брать и значения
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()
    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }


}

fun megaMain() {
    val myMap = mapOf<String, Int>()
    for (entry in myMap.entries) {
        println("${entry.key}=${entry.value}")
    }
    println(myMap.values)
    println(myMap.keys)
    val mapProduct = mapOf<String, Int>()
    println(mapProduct.getOrElse("pelmen") {
        throw Exception()
    })
    println(mapProduct.containsKey("borsh"))
    mapProduct.containsValue(10)

    val listProduct = mapProduct.map { "Products ${it.key} costs ${it.value}" }

    mapProduct.isEmpty()
    mapProduct.isNotEmpty()
    mapProduct.all { it.value > 10 }
    mapProduct.any { it.value > 100 }
    mapProduct.filterValues { it > 100 }
    val mutableProduct = mapProduct.toMutableMap()
    mutableProduct.remove("pineaple")
    mutableProduct.putAll(mapOf())
    mutableProduct.clear()


}