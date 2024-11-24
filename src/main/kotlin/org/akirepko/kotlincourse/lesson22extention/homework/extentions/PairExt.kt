package org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions

fun <A, B> Pair<A?,B?>?.turnPair(): Pair<B?, A?>{
    return Pair(this?.second, this?.first)
}