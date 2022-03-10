package baseball

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class BaseBallPlayTest {
    private val baseballGame = BaseBall()

    @BeforeEach
    fun init() {
        baseballGame.baseBall.buildBallListAndCheckRepeat("123")
    }


    @Test
    fun playBalseBall_Strike(){
        //given
        val play = baseballGame.playAndReturnResult("123")
        println(play.getBall())
        println(play.getStrike())
    }
}