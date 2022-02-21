package baseball

private const val INPUT_START_NUMBER = 1
private const val INPUT_LAST_NUMBER = 9

class Ball {
    fun inputNumber(number: Int): Boolean {
        if (number in INPUT_START_NUMBER..INPUT_LAST_NUMBER) {
            return true
        }
        return false
    }
}
