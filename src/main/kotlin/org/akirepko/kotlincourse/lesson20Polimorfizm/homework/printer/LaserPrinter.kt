package org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.printer

import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.Colors
import org.example.org.akirepko.kotlincourse.lesson17Polimorfizm.homework.Background
import java.awt.Color

class LaserPrinter(val text: String) : Printer() {
    override fun printColored() {
        println("${Colors.BLACK}${Background.WHITE}${text.split(" ")}")

    }
}