package org.example.org.akirepko.kotlincourse.lesson29.homework

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal


fun main() {
//    Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val currentTime = Instant.now()
    println(currentTime)
//    Создай дату своего дня рождения.
    val myBirthday = LocalDate.of(1993, 7, 31)
    println(myBirthday)

//    Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val currentDate = LocalDate.now()
    val nowPeriod = Period.between(currentDate, myBirthday)
    println(nowPeriod)

//    Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше. Не используй в них метод now()
    wtf(myBirthday)
    jesusWtf(myBirthday)
    wtf(LocalTime.of(12, 12, 12, 1))
    jesusWtf(LocalTime.of(12, 12, 12, 1))
    wtf(LocalDateTime.of(1995, 12, 12, 12, 1))
    jesusWtf(LocalDateTime.of(1995, 12, 12, 12, 1))
    wtf(ZonedDateTime.of(2024, 12, 16, 10, 0, 0, 0, ZoneId.of("Europe/Moscow")))
    jesusWtf(ZonedDateTime.of(2024, 12, 16, 10, 0, 0, 0, ZoneId.of("Europe/Moscow")))

    identifyGeneration(LocalDate.of(1946, 12, 31))
    /*
   Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в месяц и день.
   Выведи первую отформатированную дату, прибавив к ней 10 дней.
   Выведи вторую отформатированную дату, прибавив к ней 10 дней.
   Найди отличия)))*/

    val firstdate = LocalDate.of(2023,2,25)
    val secondDate = LocalDate.of(2024,2,25)

    println(firstdate.plusDays(10))
    println(secondDate.plusDays(10))

}

//    Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того, содержит ли аргумент время и часовой пояс.
//    Temporal - это общий тип для разных классов даты-времени.
//    В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте.
//    Обработай в методе все типы дат, которые знаешь. Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.
fun wtf(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ"))
        else -> temporal.toString()
    }.also { println(it) }
}

fun jesusWtf(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_TIME)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        else -> temporal.toString()
    }.also { println(it) }


}

//Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
//определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
//и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один из этих диапазонов,
//функция должна возвращать "Не определено". Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate).
//Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.
private val boomerFirstDate = LocalDate.of(1945, 12, 31)
private val boomerSecondDate = LocalDate.of(1965, 1, 1)
private val zoomerFirstDate = LocalDate.of(1997, 12, 31)
private val zoomerSecondDate = LocalDate.of(2012, 1, 1)
fun identifyGeneration(birthday: LocalDate) {
    when {
        birthday.isAfter(boomerFirstDate) && birthday.isBefore(boomerSecondDate) ->
            "Бумер"

        birthday.isAfter(zoomerFirstDate) && birthday.isBefore(zoomerSecondDate) ->
            "Зумер"

        else -> "Не определено"
    }.also { println(it) }
}