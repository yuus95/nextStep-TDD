package baseball.list

import baseball.Ball

class BallList {
    val ballList = mutableListOf<Ball>()

    fun buildBallList(inputNumber: String) {
        iterateBuildBall(inputNumber)

    }

    fun iterateBuildBall(inputString: String) {
        for( stringNumber in inputString){
            ballFromString(stringNumber.toString().toInt())
        }
    }

    private fun ballFromString(inputNumber: Int){
        try {
            val ball = Ball()
            ball.buildBall(inputNumber)
            ballList.add(ball)
        }catch(e: Exception){
            println("숫자 오류")
        }
    }
}
