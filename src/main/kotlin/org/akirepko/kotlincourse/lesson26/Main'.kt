package org.example.org.akirepko.kotlincourse.lesson26

fun processWebData(
    query: String,
    fetcher: (String) -> List<Map<String, Any>>,
    transformer: (List<Map<String, Any>>) -> List<User>,
    displayer: (List<User>) -> Unit
) {
    val rawData = fetcher(query)
    val transformedData = transformer(rawData)
    displayer(transformedData)
}

data class User(val name: String)

fun main() {
    val fetcher: (String) -> List<Map<String, Any>> = {
        listOf(mapOf("Andrey" to 5))
    }
    val transformer: (List<Map<String, Any>>) -> List<User> = {
        it.map { User(it.keys.first()) }
    }
    val displayer: (List<User>) -> Unit = {
        println(it)
    }
    processWebData("sql query", fetcher, transformer, displayer)

    val arg3: (Int) -> String = {
        it.toString() + "5"
    }

    val arg4: (Int) -> String = {
        "${it + 5}"
    }
    funB(arg3)
}

fun myFun(fuunA: () -> Unit) {}

fun funB(funC: (Int) -> String) {
    println(funC(2))
}


fun <T> somthing(list: List<T>, trans: (List<T>) -> T): T {
    return trans(list)
}