package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
}


class CalculatorTest {
    fun addTest() {
        val cal = Calculator(5)
        cal.add(3)

        if (cal.number != 8) {
            throw IllegalStateException()
        }
    }

}