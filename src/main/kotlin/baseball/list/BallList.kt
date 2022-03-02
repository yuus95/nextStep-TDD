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

    fun buildBallListAndCheckRepeat(numberList: List<Int>) {
        iterateBuildBallAndBuildSetBall(numberList)
        checkNoRepeat()
    }

    private fun iterateBuildBallAndBuildSetBall(inputString: String) {
        for (i in 0 until 3) {
            buildBallAndBallNumberSet(i, inputString[i].toString().toInt())
        }
    }

    private fun iterateBuildBallAndBuildSetBall(numberList: List<Int>) {
        for (i in 0 until 3) {
            buildBallAndBallNumberSet(i, numberList[i])
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
        fun builder(numberList: List<Int>): BallList {
            val ballList = BallList()
            ballList.buildBallListAndCheckRepeat(numberList)
            return ballList
        }
    }
}
