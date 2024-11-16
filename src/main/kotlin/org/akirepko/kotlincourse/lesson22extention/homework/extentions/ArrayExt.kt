package org.example.org.akirepko.kotlincourse.lesson22extention.homework.extentions

 fun Array<Int>.pairNumber(): Pair<Int,Int>{
     return Pair(this[0], this[this.size-1])
 }