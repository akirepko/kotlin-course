package org.example.org.akirepko.kotlincourse.lesson30.homework

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).
//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.
//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые
// названия типов недвижимости в порядке возрастания длины названия enum.
//Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого
// значения и возвращает Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда.
// Если без исключений - pass, если будет AssertionError - failure, прочие исключения  - broken.
//Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты.
// Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо признаку
// (расстояние или вес). Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.
fun sortRealEstate() {
    RealEstate.values()
        .sortedBy { it.name.length }
        .forEach { println(it.type) }
}


fun testResult(test: () -> Unit): TestStatus {
    return try {
        test()
        TestStatus.PASS
    } catch (e: AssertionError) {
        TestStatus.FAILURE
    } catch (e: Throwable) {
        TestStatus.BROKEN
    }
}

fun filterPlanet(filter: (SolarSystem) -> Boolean): SolarSystem {
    return SolarSystem.entries.firstOrNull(filter)?: throw Exception("Планет в этом спике нет")

}

fun main() {
    sortRealEstate()
}