package org.akirepko.kotlincourse.lesson31

import org.example.org.akirepko.kotlincourse.lesson31.Calculator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest{
    @Test
    fun plus(){
        val calc=Calculator()
        val result= calc.plus(2,3)
        Assertions.assertEquals(result,5)
    }
}