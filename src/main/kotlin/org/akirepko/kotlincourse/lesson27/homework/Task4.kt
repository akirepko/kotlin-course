package org.example.org.akirepko.kotlincourse.lesson27.homework
/*


Задание 4: Использование with для преобразование Person в Employee
Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee,
указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.

*/


fun main() {
    val myPerson = with(Person("Игорь", 13)) {
        Employee(name, age, "lox")
    }

    println(myPerson.position)

}