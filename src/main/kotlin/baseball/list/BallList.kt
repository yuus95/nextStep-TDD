package baseball.list

import baseball.Ball
import java.security.InvalidParameterException

class BallList {
    val ballList = mutableListOf<Ball>()
    private val ballNumberSet = mutableSetOf<Int>()

    fun buildBallListAndCheckRepeat(inputNumber: String) {
        iterateBuildBallAndBuildSetBall(inputNumber)
        checkNoRepeat()
    }

    private fun iterateBuildBallAndBuildSetBall(inputString: String) {
        for (i in 0 until 3) {
            buildBallAndBallNumberSet(i, inputString[i].toString().toInt())
        }
    }

    private fun buildBallAndBallNumberSet(position: Int, inputNumber: Int) {
        ballList.add(Ball.builder(position, inputNumber))
        ballNumberSet.add(inputNumber)
    }

    private fun checkNoRepeat(): Boolean {
        if (ballNumberSet.size == 3) {
            return true
        }
        throw InvalidParameterException("중복된 숫자가 존재합니다")
    }

    fun play(answerBall: Ball): Ball.BallStatus? {
        return ballList.map { it.play(answerBall) }
            .firstOrNull {
                it.isNotNothing()
            }
    }

    companion object {
        fun builder(stringInput: String): BallList {
            val ballList = BallList()
            ballList.buildBallListAndCheckRepeat(stringInput)
            return ballList
        }
    }
}
