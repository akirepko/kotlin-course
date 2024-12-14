package org.example.org.akirepko.kotlincourse.lesson29

import java.time.*
import java.time.format.DateTimeFormatter

fun main() {
    val instant = Instant.now()
    println(instant)

    val dateTimeNow = LocalDate.now()
    val birthday = LocalDate.of(1983, 10, 2)
    val localTimeNow = LocalTime.now()
    val endOfTheMyWorkingDay = LocalTime.of(18, 0, 0)


    val localDateTime = LocalDateTime.now()
    println(localDateTime)

    val alarmClock = LocalDateTime.of(2024, 4, 1, 9, 0, 0)

    val vaticanCurrentTime = ZonedDateTime.now(ZoneId.of("Europe/Vatican"))
    val mobileWorldCongress = ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"))
println("$vaticanCurrentTime этоvaticanCurrentTime ")

    val vaticanCurrentTimeInstant = vaticanCurrentTime.toInstant()
    println("$vaticanCurrentTimeInstant этоaticanCurrentTimeInstant ")
    val birthdayInstant = birthday.atTime(19, 0).toInstant(ZoneOffset.of("+09:00"))
    val instantToZonedDateTime = instant.atZone(ZoneId.systemDefault())
    val instantToOffsetDateTime = instant.atOffset(ZoneOffset.of("-02:00"))

    LocalDate.now().plusYears(1)
    LocalDateTime.now().plusSeconds(1)
    LocalDate.now().minusYears(1)

    Period.between(birthday, LocalDate.now())
    Duration.between(alarmClock, LocalDateTime.now())
    alarmClock.isAfter(localDateTime)
    alarmClock.isBefore(localDateTime)
    alarmClock.isEqual(localDateTime)

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ")
    val formattedDate = vaticanCurrentTime.format(formatter)
    println("Текущая дата и время с миллисекундами и часовым поясом: $formattedDate")
    val isoFormatter = DateTimeFormatter.ISO_DATE_TIME
    val birthdayInDubai= LocalDate.now()
    val isoFormattedDate = birthdayInDubai.format(isoFormatter)
    println(isoFormattedDate)

    try {
        println("При форматировании с часовым поясом помни, что в LocalDateTime его нет и будет ошибка ${localDateTime.format(formatter)}")
    } catch (e: Throwable) {
        e.printStackTrace()
    }

    try {
        println("При форматировании LocalDate помни, что нет полей времени и будет ошибка ${birthday.format(formatter)}")
    } catch (e: Throwable) {
        e.printStackTrace()
    }
    val prettyFormatter = DateTimeFormatter.ofPattern("'год' yyyy', месяц' MM', день' dd")
    val prettyFormattedDate = dateTimeNow.format(prettyFormatter)
    println(prettyFormattedDate)

    val parsedDate = LocalDate.parse(prettyFormattedDate, prettyFormatter)
    println(parsedDate)

    val currentTime = Instant.now()
    val myTime = Instant.ofEpochSecond(121212121)
    println(myTime)
    val dayOne = LocalDate.of(2024, 9, 1)
    val dayTwo = LocalDate.of(2025, 6, 1)
    val differtDays = Period.between(dayOne, dayTwo)
    println(differtDays)
    val dayThree = Period.of(2, 4, 430)
    println(dayTwo.plus(dayThree))
    val calendar = ZonedDateTime.of(2024, 12,16,10,0,0,0,ZoneId.of("Europe/Moscow"))
    println(calendar)
    println(dayThree.multipliedBy(2))


}