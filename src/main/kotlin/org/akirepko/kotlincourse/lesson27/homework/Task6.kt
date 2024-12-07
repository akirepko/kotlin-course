package org.example.org.akirepko.kotlincourse.lesson27.homework
/*Задание 2:
Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee, добавить ему email и department с помощью apply, вернуть инициализированный объект.
Задание 6: Использование let для безопасного преобразования Person в Employee
Создайте функцию, которая принимает объект класса Person?,
который может быть null. В функции используйте функцию let для создания Employee,
только если объект Person не null. В противном случае возвращается null
*/


fun main() {
        val nullPerson = null
    println(hr(nullPerson))

}

fun hr(person: Person?): Employee? {
    return person?.let {
        Employee(it.name, it.age,"Developer") }
}