
import baseball.BaseBall
import java.util.*

fun main() {
    val randomNumber = randomNumber()
    val baseBall = BaseBall()
    baseBall.baseBall.buildBallListAndCheckRepeat(randomNumber)
    while(baseBall.getResult().getStrike() != 3){
        val sc = Scanner(System.`in`)
        val input = sc.next()
        val playAndReturnResult = baseBall.playAndReturnResult(input)
        println("ball: ${playAndReturnResult.getBall()} strike: ${playAndReturnResult.getStrike()}")
    }
    return
}
fun randomNumber(): List<Int> {
    //given
    val randomList = mutableListOf<Int>()
    val number = (1..9).random()
    while (randomList.size != 3) {
        val number = (1..9).random()
        if (randomList.contains(number)) {
            continue
        }
        randomList.add(number)
    }
    return randomList
}