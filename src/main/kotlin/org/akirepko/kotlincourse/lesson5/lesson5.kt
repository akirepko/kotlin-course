package org.example.org.akirepko.kotlincourse.lesson5

import org.akirepko.kotlincourse.lesson3.report

fun main(){
    val sum=10+5
   val diff=10-5
    val remainder=10*6
    val remainder1=10/5
    val isEqual=(5==4)
    val isNotEqual=(5!=5)
    val isLeater=(3<5)
    println(sum)
    println(diff)


    val defaultName="unknown"

    val name:String?=getName()

    val result= name ?:throw Exception("выхода нет")

    printPrice(1.1,1)
    printPrice(1.1,null)
}

fun getName():String?{
    return null
}
fun printVolume(userVolume:Int?){
    val defaultVolume=30
    println(userVolume ?: defaultVolume)
}

fun printPrice(price:Double, discont:Int?){
    val kof= (100-(discont?: 0))/100.0
    println(kof*price)

}

fun printLanguage(userLanguage:String?){
    val defaultLanguage="English"
    println(userLanguage?:defaultLanguage)
}

fun printBox(stuff:String?){
    println( stuff ?: throw Exception ("Box is empty"))
}
