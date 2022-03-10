package calculator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CalculatorTest {


    @Test
    fun empty_Test(){
        val nullResult = Calculator.splitAndSum(null)
        val emptyResult = Calculator.splitAndSum("")
        Assertions.assertEquals(nullResult,0)
        Assertions.assertEquals(emptyResult,0)
    }

    @Test
    fun onlyOneNumber(){
        val oneResult = Calculator.splitAndSum("1")
        Assertions.assertEquals(oneResult,1)
    }

    @Test
    fun twoOrMoreNumber(){
        Assertions.assertEquals(Calculator.splitAndSum("1,2"),3)
    }

    @Test
    @DisplayName(",와 : 의 구분자 사용")
    fun separatorIsMoreThanTwo(){
        Assertions.assertEquals(Calculator.splitAndSum("1,2:3"),6)
    }

    @Test
    @DisplayName("커스텀 구분자 사용하기")
    fun customSeparator(){
        Assertions.assertEquals(Calculator.splitAndSum("//;\n1;2;3"),6)
    }

    @Test
    fun negativeNumberError(){
        Assertions.assertThrows(RuntimeException::class.java) { Calculator.splitAndSum("-1,2,3") }
    }
}