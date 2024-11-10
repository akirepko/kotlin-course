package org.example.org.akirepko.kotlincourse.lesson19Abstraction.homework

abstract class ProgrammEqupiment : Programmable, IncludedEqupiment() {
    override fun programAction(action: String) {
       println("Напрогимурем что-то например $action")
    }

    override fun execute() {
       println("выполняется программа")
    }
}