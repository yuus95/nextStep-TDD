package baseball.list

import baseball.Ball
import java.security.InvalidParameterException

class BallList {
    val ballList = mutableListOf<Ball>()
    private val ballNumberSet = mutableSetOf<Int>()

    fun buildBallListAndCheckRepeat(inputNumber: String) {
        iterateBuildBall(inputNumber)
        checkNoRepeat()
    }

    private fun iterateBuildBall(inputString: String) {
        for (stringNumber in inputString) {
            buildBallAndBallNumberSet(stringNumber.toString().toInt())
        }
    }

    private fun buildBallAndBallNumberSet(inputNumber: Int) {
        val ball = Ball()
        ball.buildBall(inputNumber)
        ballList.add(ball)
        ballNumberSet.add(inputNumber)
    }

    private fun checkNoRepeat(): Boolean {
        if (ballNumberSet.size == 3) {
            return true
        }
        throw InvalidParameterException("중복된 숫자가 존재합니다")
    }
}
