package baseball.list

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class NoRepeatBallNumberTest {
    private val ballList = BallList()

    @Test
    @DisplayName("볼3개는 중복되는 숫자가 되면 안된다.")
    fun buildBallListAndCheckRepeat() {
        ballList.buildBallListAndCheckRepeat("123")
        Assertions.assertTrue(ballList.ballList[0].checkNumber(1))
        Assertions.assertTrue(ballList.ballList[1].checkNumber(2))
        Assertions.assertTrue(ballList.ballList[2].checkNumber(3))
    }

    @Test
    @DisplayName("숫자가 중복되면 실패처리")
    fun buildBallListAndCheckRepeatFailed() {
        Assertions.assertThrows(Exception::class.java) { ballList.buildBallListAndCheckRepeat("113") }
    }
}