package org.example.org.akirepko.kotlincourse.lesson25
fun main(){
    val increment = fun (a: Int): Int {
        return a + 1
    }
    val increment2: (Int) -> Int = { a ->
        a + 1
    }
    val increment1: (a: Int) -> Int = {
        it + 1
    }

    val increment3 = {a: Int-> a+1}



    val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }

    val findIndex1: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
        text.indexOf(word, 0, ignoreCase)
    }

    val findIndex2 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)
    }
    println(findIndex1("мама мыла раму", "мыла", false))


    fun OrderProcessor.calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }

    val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }

    val calculateDeliveryTime1: OrderProcessor.(Int) -> String = {
        val deliveryTimeDays = when (it) {
            in 1..100 -> 3
            else -> 5
        }
        "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}
// Обычное объявление функции
fun increment(a: Int): Int {
    return a + 1
}

fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
    return text.indexOf(word, 0, ignoreCase)
}

class OrderProcessor(val deliveryAddress: String) {

    fun calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}