package org.example.org.akirepko.kotlincourse.lesson27

fun main() {
//    val list = mutableListOf(1, 2, 3, 4)
//
//    list.add(2)
//    println(list)
//
//    val list1 =list.toList()

    val list2 = with(mutableListOf(1, 2, 3, 4)) {
        add(2)
        println(this)
        toList()
    }

    val sb = StringBuilder()
    sb.append("asdasd")
    sb.append("asdasd")
    sb.append("asdasd")
    sb.append("asdasd")
    val x = sb.length

    val myRun = StringBuilder().run {
        append("asdasd")
        append("asdasd")
        append("asdasd")
        append("asdasd")
        length
    }

//    val list = arrayListOf<String>()
//    list.add("123213")
//    list.add("123213")
//    list.add("123213")
//    list.add("123213")

    val list = arrayListOf<String>().apply {
        add("123213")
        add("123213")
        add("123213")
        add("123213")
    }

    val list3 = arrayListOf<String>().also {
        it.add("123213")
        it.add("123213")
        it.add("123213")
        it.add("123213")
    }


    val string: String? = null
    string?.length

    println(string?.length)
    println(string?.isEmpty())
    println(string?.uppercase())

    string?.let {
        println(it.length)
        println(it.isEmpty())
        println(it.uppercase())
    }


}