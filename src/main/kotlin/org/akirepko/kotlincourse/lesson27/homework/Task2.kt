package org.example.org.akirepko.kotlincourse.lesson27.homework
/*Задание 2: Использование apply для инициализации объекта Employee
Создайте объект Employee и используйте apply для инициализации его полей email и department.

*/


fun main() {
    val myEmployee = Employee("Игорь", 13, "Директор").apply {
        email = "12122@1212.22"
        department = "QA"
    }
    println(myEmployee.email)

}