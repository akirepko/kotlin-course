package org.example.org.akirepko.kotlincourse.lesson_3

class Homework {

    val nameEvent:String="hack"
    val date:String="01/02/2022"
    lateinit var place:String

    var budget: Double=0.0
        get() = field
        set(value){
            if (value>0) field+=value
        }

    var count:Int=0
        get()=field
        set(value){
            if (value>0) field=value
        }


}