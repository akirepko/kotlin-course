package org.example.org.akirepko.kotlincourse.lesson18Inkapsulation

import org.example.org.akirepko.kotlincourse.lesson18Inkapsulation.homework.BaseClass
import org.example.org.akirepko.kotlincourse.lesson18Inkapsulation.homework.ChildrenClass

fun main(){
    val account =Account(0.2)

    val student =Student ("sds",11,111)
    student.showAge()

    val base = ChildrenClass("","","")
    base.publicField = "Ан"
    println(base.getAll())
    base.printText()
}