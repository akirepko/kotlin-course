package org.example.org.akirepko.kotlincourse.lesson27.homework
/*

Задание 3: Использование also для логирования
Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде.
Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.
*/


fun main() {
    val myPerson = Person("Игорь", 13, ).also {
        println(aboutPerson(it))
    }
    println(myPerson.email)

}

fun aboutPerson(person: Person): String{
    return  return "Имя: ${person.name}\nВозраст: ${person.age}\nemail: ${person.email}"
}