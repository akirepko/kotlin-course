package org.example.org.akirepko.kotlincourse.lesson6

fun main(){
    val intRange: IntRange=1..10
    val intRangeUntil: IntRange=1 until 10

    val number=4
    if(number>5){
        println("Число больще 4")
}
    else if (number==6){
        println("Число меньше или равно 5")
    }
    else{
        println("2323")
    }
    val score=95
    when {
        score in 90..100-> println("")
        score in 80..89->println("")
        else-> println("")


    }
    val a=4
    val b=5
    val max=if (a>b)a else b
    val result= when (score){
        in 90..100->"great"
        in 80..90->"good"
        else -> "{}"
    }
println(result)



}

fun getTimesOfDay(hour:Int):String{
    return if(hour in 0..4){
        "Night"

    }
    else if(hour in 5..11){
        "Morning"
    }
    else if( hour in 12..16){
        "day"
    }
    else{
        "Evning"
    }
//    when(hour){
//        0..5-> "Night"
//        6..12-> "Day"
//        else-> "Morning"
//
//    }
}

fun checkPassword(password: String):Boolean{
    if (password.length<8){
      return  false
    }
//     if (checkSymbols(password)) return true
//     return false
    return checkSymbols(password)

}
fun checkSymbols (password: String):Boolean{
    return false
}

fun convertMark(mark:Int):String{
    return when(mark){
        in 0..20->"F"
        in 21..40->"E"
        in 41..60->"D"
        else->"Error"

    }
}