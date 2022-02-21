package collection

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class SetCollection {
    private val numbers = HashSet<Int>()

    @BeforeEach
    fun setUp() {
        numbers.add(1)
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)
    }

    @Test
    fun `HashSet Size`() {
        //given
        Assertions.assertEquals(numbers.size, 3)
        //when

        //then
    }

    @ParameterizedTest
    @MethodSource("intArray")
    fun contains(input: Int) {
        Assertions.assertTrue(numbers.contains(input))
    }

    @ParameterizedTest
    @MethodSource("intArray2")
    fun contains2(input: Int) {
        Assertions.assertTrue(numbers.contains(input))
    }


    companion object {
        @JvmStatic
        fun intArray() = listOf(1, 2, 3, 4)

        @JvmStatic
        fun intArray2() = listOf(1, 2, 3, 4, 5)
    }
}