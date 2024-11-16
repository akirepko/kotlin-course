package org.example.org.akirepko.kotlincourse.lesson20

class Container<T>(val item: T) {
}

class PairBox<A, T>(val first: A, val second: T) {

}

class LimitedContainer<T : Number>(val item: T?) {

}

interface Storage<T> {
    fun set(item: T) {

    }

    fun get(): T


}

interface Transformer<T, K> {
    fun transform(item: T): K
}

fun <T> swap(list: List<T>, a: Int, b: Int): List<T> {
    return list
}

fun <T> second(listOne: List<T>, listTwo: List<T>) {}


fun <K, V> toMap(keys: List<K>, value: List<V>): Map<K, V>{
    return TODO("Provide the return value")
}