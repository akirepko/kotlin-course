package org.akirepko.kotlincourse.lesson3VarVal

val chassis: String = "!12334abc"

var colour: String = "Purple"

var distance: Double = 0.0

lateinit var  owner:String

const val WHEELS:Int=4

val report:String by lazy{
    ""
}
var fuel: Double=0.0
    get() = field
    set(value){
        if (value>0) field+=value
    }