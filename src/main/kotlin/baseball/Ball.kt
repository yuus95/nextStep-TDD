package baseball

import java.security.InvalidParameterException

private const val INPUT_START_NUMBER = 1
private const val INPUT_LAST_NUMBER = 9

class Ball {
    private var number: Int = 0

    fun buildBall(number: Int) {
        if (inputNumber(number)) {
            this.number = number
        }
    }

    fun inputNumber(number: Int): Boolean {
        if (number in INPUT_START_NUMBER..INPUT_LAST_NUMBER) {
            return true
        }
        throw InvalidParameterException("숫자입력 오류")
    }

    fun checkNumber(compareNumber: Int): Boolean {
        if (this.number == compareNumber) {
            return true
        }
        return false
    }

}
