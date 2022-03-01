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
        val inputBaseBallList = BallList.builder("152")
        val play = baseballGame.play(inputBaseBallList.ballList)
        println(play)
        //when

        //then
    }
}