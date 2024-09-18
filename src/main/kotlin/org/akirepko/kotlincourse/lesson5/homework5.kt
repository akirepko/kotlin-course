package org.example.org.akirepko.kotlincourse.lesson5

fun main(){
    soundAttenuation(5,0.6)
    soundAttenuation(5,null)

    order(200.0)
    order(null)

    atmosphericPressure("Какое-то давление")
    atmosphericPressure(null)


}
 fun soundAttenuation(soundAttenuation:Int, factor:Double?){
     var result=factor ?: 0.5
     println(result*soundAttenuation)
 }
fun order(price :Double?){
    val delivery=(price?:10000.0)/100.0*0.5

    println(delivery)

}
fun atmosphericPressure(result:String?){
    println(result?: throw Exception("Юра  мы все потеряли"))
}