package baseball

import java.security.InvalidParameterException

private const val INPUT_START_NUMBER = 1
private const val INPUT_LAST_NUMBER = 9

class Ball {
    private var position: Int = 0
    private var number: Int = 0

    fun buildBall(position: Int, number: Int) {
        if (inputNumber(number)) {
            this.number = number
            this.position = position
        }
    }

    fun inputNumber(number: Int): Boolean {
        if (number in INPUT_START_NUMBER..INPUT_LAST_NUMBER) {
            return true
        }
        throw InvalidParameterException("숫자입력 오류")
    }

    fun play(otherBall: Ball): BallStatus {
        if (equals(otherBall)) {
            return BallStatus.STRIKE
        }
        if (checkNumber(otherBall.number)) {
            return BallStatus.BALL
        }
        return BallStatus.NOTHING
    }

    fun checkNumber(compareNumber: Int): Boolean {
        if (this.number == compareNumber) {
            return true
        }
        return false
    }

    fun equals(other: Ball): Boolean {
        if (other is Ball) {
            return position == other.position && number == other.number
        }
        return false
    }

    enum class BallStatus {
        BALL, STRIKE, NOTHING
    }

    companion object {
        fun builder(position: Int, number: Int): Ball {
            val result = Ball()
            result.buildBall(position, number)
            return result
        }
    }
}
