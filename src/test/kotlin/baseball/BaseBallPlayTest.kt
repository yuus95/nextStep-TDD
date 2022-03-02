package baseball

import baseball.list.BallList
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
        val inputBaseBallList = BallList.builder("123")
        val play = baseballGame.playAndReturnResult(inputBaseBallList.ballList)
        println(play.getBall())
        println(play.getStrike())
    }
}