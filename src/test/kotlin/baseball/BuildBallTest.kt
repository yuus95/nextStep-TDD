package baseball

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BuildBallTest {
    private val ball = Ball()

    @Test
    @DisplayName("유효성 검사를 한 뒤 볼을 생성한다.")
    fun buildBall() {
        ball.buildBall(0)
        Assertions.assertTrue(ball.checkNumber(1))
    }
}