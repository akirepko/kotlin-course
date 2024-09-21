package org.example.org.akirepko.kotlincourse.lesson6

fun main(){
    println(sesonDefinition(55))
    println(petAge(3.0))
    println(vehilceDefinition(2))
    println(bonusesProgramm(22222))
}
fun sesonDefinition(month:Int):String{
    return if (month==1||month==2 || month==12){
        "Winter"
    }
    else if (month in 3..5){
        "Spring"}
    else if (month in 6..8) {
        "Summer"
    }
    else if (month in 9..11){
        "Fall"
    }
    else{
        "Wrong number"
    }

}
fun petAge(age:Double):Double{
    if (age<=2){
        return age*10.5
    }
    else {
        return (age-2)*4+21
    }
}

fun vehilceDefinition(way:Int):String{
    if (way<1){
        return "Иди пешком"
    }
    else if (way>1&& way<5){
        return "найди велосипед"
    }
    else return "нужна машина"
}

fun bonusesProgramm(summOrder:Int):Int{
    return if(summOrder<=100){
         summOrder/100*2}
    else summOrder/100*5
}

fun documentsDefinintion(extension:String):String{
    return when(extension){
        "txt"->"Текстовый документ"
        "png"-> "Изображение"
        "tbl"->"Таблица"
        else-> "Неизвестный тип"
    }
}

fun converTemperature(degree:Int, typeDegree:String):String{
    val result:Double
    if (typeDegree=="C"){
        result=degree*1.8+32
        return "$result F"
    }
    else if (typeDegree=="F"){
        result=(degree-32)/1.8
        return "$result C"
    }
    else return "Это не те единицы"
}

fun selectionClothes(degree:Int):String{
    return when(degree){
        in -30..0-> "куртка и шапка"
        in 0..15-> "ветровка"
        in 15..35->"футболка и шорты"
       else->"Лучше никуда не ходить, сиди пиши код"

    }

}

fun ageFilm(age:Int):String{
    return when {
        age in 0..12-> "детские"
        age in 13..18->"подростковые"
        age>18-> "18+"
        else-> "Введите коректный возраст"


    }

}