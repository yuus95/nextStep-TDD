package baseball

private const val INPUT_START_NUMBER = 1
private const val INPUT_LAST_NUMBER = 9

class Ball {
    private var number: Int = 0
    private var position: Int = 0

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
        return false
    }

    fun checkNumber(compareNumber: Int): Boolean {
        if (this.number == compareNumber) {
            return true
        }
        return false
    }

}
