package org.example.org.akirepko.kotlincourse.lesson31.homework

import com.google.gson.GsonBuilder

fun main() {
    val qa1 = Employee("Игорь", true, "2000-01-01", CharacterTypes.QA)
    val qa2 = Employee("Олег", false, "2001-01-01", CharacterTypes.QA)
    val gameDev = Employee("Маша", true, "2000-02-01", CharacterTypes.GAME_DEV)
    val designer = Employee("Виталя", true, "2000-02-01", CharacterTypes.UX_UI)
    val qaLead = Employee("Никита", false, "1990-10-04", CharacterTypes.TEAM_LEAD, listOf(qa1, qa2))
    val teamLead = Employee("Саша", false, "1990-10-04", CharacterTypes.TEAM_LEAD, listOf(gameDev, designer))
    val cto= Employee("Валентин Карлович", true, "1975-11-05", CharacterTypes.CTO, listOf(qaLead, teamLead))

    val gson = GsonBuilder().setPrettyPrinting().serializeNulls().create()
    val json = gson.toJson(cto)
    println(json)

    val date = gson.fromJson(json, Employee::class.java)
    println(date)

}