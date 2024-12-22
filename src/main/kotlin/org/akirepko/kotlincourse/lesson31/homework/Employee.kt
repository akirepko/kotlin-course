package org.example.org.akirepko.kotlincourse.lesson31.homework

data class Employee(
    val namr:String,
    val status: Boolean,
    val bithdayDate: String,
    val characterType : CharacterTypes,
    val employess : List<Employee> = listOf()
)
