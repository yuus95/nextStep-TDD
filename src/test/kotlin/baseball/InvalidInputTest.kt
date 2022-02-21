package baseball

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class InvalidInputTest {


    @Test
    @DisplayName("입력받은 값은 1-9사이에있어야한다.")
    fun invalidInput() {
        val ball = Ball()
        Assertions.assertTrue(ball.inputNumber(9))
        Assertions.assertTrue(ball.inputNumber(1))
        Assertions.assertFalse(ball.inputNumber(0))
        Assertions.assertFalse(ball.inputNumber(10))
    }
}