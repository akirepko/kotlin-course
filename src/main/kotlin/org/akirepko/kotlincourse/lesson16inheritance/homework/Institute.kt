package org.example.org.akirepko.kotlincourse.lesson16inheritance.homework

open class Institute(
    name: String,
    level: String,
    val facultat: String
) : EducationalInstitution(name, level) {
}