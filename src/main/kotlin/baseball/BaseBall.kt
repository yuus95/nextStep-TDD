package baseball

import baseball.list.BallList

class BaseBall {
    val baseBall: BallList = BallList()
    private var playResult = PlayResult()

    fun playAndReturnResult(input:String): PlayResult {
        val inputBallList = BallList.builder(input)
        val ballStatusList = mutableListOf<Ball.BallStatus>()
        for (otherBall in inputBallList.ballList) {
            val play = baseBall.play(otherBall)
            if (play != null) {
                ballStatusList.add(play)
            }
        }
        getResult(ballStatusList)
        return playResult
    }

    fun getResult(): PlayResult {
        return playResult
    }

    private fun getResult(ballStatusList: MutableList<Ball.BallStatus>) {
        playResult = PlayResult()
        for (x in ballStatusList) {
            checkResult(x)
        }
    }

    private fun checkResult(status: Ball.BallStatus) {
        if (status == Ball.BallStatus.BALL) {
            playResult.addBall()
            return
        }
        playResult.addStrike()
        return
    }

}
