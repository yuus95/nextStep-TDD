package baseball.list

import baseball.Ball

class BallList {
    val ballList = mutableListOf<Ball>()
    val ballNumberSet = mutableSetOf<Int>()

    fun buildBallList(inputNumber: String) {
        iterateBuildBall(inputNumber)
    }

    fun iterateBuildBall(inputString: String) {
        for (stringNumber in inputString) {
            buildBallAndBallNumberSet(stringNumber.toString().toInt())
        }
    }

    fun buildBallAndBallNumberSet(inputNumber: Int) {
        val ball = Ball()
        ball.buildBall(inputNumber)
        ballList.add(ball)
        ballNumberSet.add(inputNumber)
    }
}
