package org.example.org.akirepko.kotlincourse.lesson15OOP

fun main() {
    val igor = Person("Igor", 30)
    igor.sayHello()

    Logger.log("saff")
    val result=Calculator.add(1,4)

    val myLampe=Lampe(true)
    myLampe.switch()

    val myWind=Wind(300)

    println(myWind.convertSpeed())

    val carOne =Car(Car.brands[0], "vesta")
    carOne.sayMyName()

    val myUser= User(23,"dffd")
    println(myUser.name)
}
