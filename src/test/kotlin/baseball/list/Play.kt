package baseball.list

import baseball.Ball
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Play {

    private val inputBallList = BallList.builder("123")

    @Test
    fun ballListPlay_ball() {
        val answerBall = Ball()
        answerBall.buildBall(0, 2)
        val result = inputBallList.play(answerBall)
        Assertions.assertEquals(result,Ball.BallStatus.BALL)
    }

    @Test
    fun ballListPlay_strike() {
        val answerBall = Ball()
        answerBall.buildBall(0, 1)
        val result = inputBallList.play(answerBall)
        Assertions.assertEquals(result,Ball.BallStatus.STRIKE)
    }
}