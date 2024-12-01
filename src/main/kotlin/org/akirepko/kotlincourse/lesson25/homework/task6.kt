package org.example.org.akirepko.kotlincourse.lesson25.homework

import java.lang.IllegalStateException

/*
Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает число и возвращает список ключей,
длина которых меньше их значений но больше заданного в функции аргумента. В случае если список получается пустой нужно
выкинуть исключение IllegalState.
По аналогии с предыдущим заданием выполни трансформации и проверки.
 */
fun main() {
    val myMap = mapOf("apple" to 5, "banana" to 1, "kiwi" to 2, "grapefruit" to 10)

    val myNewList = fun Map<String, Int>.(num: Int): List<String> {
        val filteredKeys = this.filter {
            it.key.length < it.value && it.key.length > num
        }
            .map { it.key }
        if (filteredKeys.isEmpty()) {
            throw IllegalStateException("No keys found that satisfy the condition.")
        }
        return filteredKeys
    }

    val myNewListOne: Map<String, Int>.(num: Int) -> List<String> = { num ->
        val filteredKeys = this.filter {
            it.key.length < it.value && it.key.length > num
        }
            .map { it.key }
        if (filteredKeys.isEmpty()) {
            throw IllegalStateException("No keys found that satisfy the condition.")
        }
        filteredKeys
    }
  try {
      println(myMap.newList(5))
  } catch (e:IllegalStateException){
      println("Problem")
  }

    try {
        println(myMap.myNewList(3))
    } catch (e:IllegalStateException){
        println("Problem")
    }

    try {
        println(myMap.myNewListOne(3))
    } catch (e:IllegalStateException){
        println("Problem")
    }

}
fun Map<String, Int>.newList(num: Int): List<String> {
    val filteredKeys = this.filter {
        it.key.length < it.value && it.key.length > num
    }
        .map { it.key }
    if (filteredKeys.isEmpty()) {
        throw IllegalStateException("No keys found that satisfy the condition.")
    }
    return filteredKeys
}