package org.example.org.akirepko.kotlincourse.lesson7

fun main(){
println("Прямой Диапазон:")
//
//    Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5){
        println(i)
    }
    println()
//    Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10){
        if(i%2==0){
        println(i)
        }
    }
    println()

println("Обратный Диапазон:")
//
//    Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1){
        println(i)
    }
    println()

//    Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1){

        println(i)
        i-2
    }
    println("С Шагом (step):")

//
//    Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2){
        println(i)
    }
    println()
//    Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3){
        println(i)
    }
    println()
    println("Использование До (until):")
//
//    Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
    for (i in 1 until 9 ){
        println(i)
    }
    println()
//    Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    for (i in 3 until 15 ){
        println(i)
    }
    println()
    println("Задания для Цикла while")

//        Создайте цикл while, который выводит квадраты чисел от 1 до 5.

        var counter=1
    while(counter<=5){
        println(counter*counter)
        counter++
    }
    println()

//    Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var counterOne=10
    while(counterOne>=5){
        println(counterOne--)
    }
    println()
    println("Цикл do...while:")
//    Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    var counterTwo=5
    do{
        println(counterTwo--)
    }while(counterTwo>=1)
    println()


//    Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counterThree=5
    do{
        counterThree++
    }while(counterThree<=10)
    println()

//    Задания для Прерывания и Пропуска Итерации
    println("Использование break:")
//
//    Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10){
        println(i)
        if (i==6)break
    }
    println()
//    Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var counterFour=1
    while(counterFour>0){
        println(counterFour++)
        if (counterFour==10)break
    }
    println()

    println("Использование continue:")
//
//    В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10){
        if (i%2==0)continue
        println(i)

    }
    println()
//
//    Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var counterFive=0
    while(counterFive++<10){
        if (counterFive%3!=0){
            println(counterFive)
        }
         else   continue

    }
    println()

    println("Задача на вложенный цикл")
//            Создать цикл в цикле, в каждом использовать диапазон от 1 до 10. В консоль вывести результат умножения переменных цикла. Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку. После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.

    for (i in 1..10){
        for (j in 1..10){
           print(i*j)
           print(" ")
        }
        println()
    }
}