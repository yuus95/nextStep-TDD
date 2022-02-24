package baseball

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BaseBallPlayTest {

    @Test
    fun BaseBallPlay(){
        val baseBall = BaseBall()
        baseBall.ballList.buildBallListAndCheckRepeat("123")
        Assertions.assertTrue(baseBall.playAndCheckBall("123"))
    }
}