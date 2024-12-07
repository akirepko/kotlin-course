package org.example.org.akirepko.kotlincourse.lesson27.homework
/* Возвращаемым значением должен быть новый объект Employee.
Задание 5: Использование run для преобразования и инициализации Employee
Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee,
 добавить ему email и department с помощью apply, вернуть инициализированный объект.
Задание 6: Использование let для безопасного преобразования Person в Employee
Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию let для создания Employee, только если объект Person не null. В противном случае возвращается null
*/


fun main() {
    val myPerson = (Person("Игорь", 13)).run{
        Employee(name,age,"QA").apply {
            email = "12122@1212.32"
            department = "QA"
        }
    }
    println(myPerson.email)


}