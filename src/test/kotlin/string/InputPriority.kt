package string

import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.util.*
import kotlin.String


class InputPriority {

    class InputPriorityCalculator {
        private var data: List<String> = listOf()
        private val numberList = mutableListOf<Int>()
        private val arithmeticOperation = mutableListOf<String>()

        fun buildInputPriorityCalculator(systemInData: String): Int {
            buildDataFromSystemInData(systemInData)
            buildNumberListAndArithmeticOperation()
            return buildSum()
        }

        private fun buildDataFromSystemInData(systemInData: String) {
            val stdin = System.`in`
            System.setIn(ByteArrayInputStream(systemInData.toByteArray()))
            val scanner = Scanner(System.`in`)
            System.setIn(stdin)
            data = scanner.nextLine().split(" ")
        }

        private fun buildNumberListAndArithmeticOperation() {
            for (str in data) {
                try {
                    numberList.add(str.toInt())
                } catch (e: NumberFormatException) {
                    arithmeticOperation.add(str)
                }
            }
        }

        private fun buildSum(): Int {
            var sum = numberList[START_INDEX]
            for (i in 1..numberList.lastIndex) {
                when (arithmeticOperation[i - 1]) {
                    "+" -> {
                        sum += numberList[i]
                    }
                    "-" -> {
                        sum -= numberList[i]
                    }
                    "/" -> {
                        sum /= numberList[i]
                    }
                    "*" -> {
                        sum *= numberList[i]
                    }
                }
            }
            return sum
        }

        companion object {
            const val START_INDEX = 0
        }
    }

    @Test
    fun inputPriority() {
        //given
        val data = "2 + 10 * 4 / 2"
        val inputPriority = InputPriorityCalculator()
        val result = inputPriority.buildInputPriorityCalculator(data)
        println(result)
    }


    @Test
    fun `리팩토링이전코드`() {
        //given
        val data = "2 + 10 * 4 / 2"
        val numberList = mutableListOf<Int>()
        val arithmeticOperation = mutableListOf<String>()
        val stdin = System.`in`
        System.setIn(ByteArrayInputStream(data.toByteArray()))
        val scanner = Scanner(System.`in`)
        System.setIn(stdin)
        val stringList = scanner.nextLine().split(" ")
        for (str in stringList) {
            try {
                numberList.add(str.toInt())
            } catch (e: NumberFormatException) {
                arithmeticOperation.add(str)
            }
        }

        var sum = numberList[InputPriorityCalculator.START_INDEX]
        for (i in 1..numberList.lastIndex) {
            when (arithmeticOperation[i - 1]) {
                "+" -> {
                    sum += numberList[i]
                }
                "-" -> {
                    sum -= numberList[i]
                }
                "/" -> {
                    sum /= numberList[i]
                }
                "*" -> {
                    sum *= numberList[i]
                }
            }
        }
        println(sum)
    }
}