package org.example.org.akirepko.kotlincourse.lesson7

fun main(){
    for(item in listOf(1,2,3)){

    }
    for(item in 1..10){
println(item)
    }
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    for (i in 1 until 10 ) {
        println(i)
    }

    var counter=10
    while (counter-->0){
     println(counter)
    }
    do {
        println("=")
    }
    while(false)

    for (i in 1..10){
        if(i==2)continue
        if(i==7)break
    }


    for (i in 1..10){
        println(i)
    }

    for (i in 1..5){
        println(i*i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 20 downTo 2 ){
        if (i%2==0) {
            println(i)
        }
        else continue

    }

    for (i in 1..30 step 2){
        println(i)
    }
        var counter1=1
         var item=0

 while (counter1<=10){
     println(item+counter1+counter1++)}

    var counter2=100
    while(counter2>1){
        println(counter2--.toString().length)
        
    }





}

