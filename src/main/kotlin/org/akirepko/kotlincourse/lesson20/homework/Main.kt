package org.example.org.akirepko.kotlincourse.lesson20.homework

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val map = mutableMapOf<K, V>()
    val size = minOf(keys.size, values.size)

    for (i in 0 until size) {
        map[keys[i]] = values[i]
    }

    return map
}

fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.size % 2 != 0) {
        list[list.size / 2]
    } else {
        list[list.size / 2 + 1]
    }
}

class ListHolder<T>(private var list: MutableList<T>) {

    fun add(item: T) {
        this.list.add(item)
    }

    fun getList(): MutableList<T> {
        return this.list
    }
}

interface Mapper<T, R> {

    fun transform(item: T): R

    fun transformList(mylist: List<T>): List<R>

}

interface Validator<T> {
    fun validate(value: T): Boolean
}

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(item: String): List<String> {
        return item.split(" ").toList()
    }

    override fun transformList(mylist: List<String>): List<List<String>> {
        return mylist.map { transform(it) }
    }

}

class StringValidator : Validator<String?> {
    override fun validate(value: String?): Boolean {
        return value.isNullOrBlank() && value.isNullOrEmpty()
    }
}
class OddValidator : Validator<Int?> {
    override fun validate(value: Int?): Boolean {
        return value!! %2==0
    }
}