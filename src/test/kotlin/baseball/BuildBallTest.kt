package baseball

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BuildBallTest {
    private val ball = Ball()

    @BeforeEach
    fun init(){
        ball.buildBall(0, 1)
    }

    @Test
    @DisplayName("유효성 검사를 한 뒤 볼을 생성한다.")
    fun buildBall() {
        Assertions.assertTrue(ball.checkNumber(1))
    }

    @Test
    @DisplayName("게임 플레이 -낫딩")
    fun play_nothing() {
        Assertions.assertEquals(ball.play(Ball.builder(0,2)),Ball.BallStatus.NOTHING)
    }

    @Test
    @DisplayName("게임 플레이 -볼")
    fun play_ball() {
        Assertions.assertEquals(ball.play(Ball.builder(1,1)),Ball.BallStatus.BALL)
    }

    @Test
    @DisplayName("게임 플레이 - 스트라이크")
    fun play_strike() {
        Assertions.assertEquals(ball.play(Ball.builder(0,1)),Ball.BallStatus.STRIKE)
    }
}