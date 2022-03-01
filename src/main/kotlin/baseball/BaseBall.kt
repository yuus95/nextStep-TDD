package baseball

import baseball.list.BallList

class BaseBall {
    val baseBall: BallList = BallList()

    fun playAndCheckBall(inputStringNumber: String): PlayResult {
        val inputBallList =  BallList.builder(inputStringNumber)
        val playResult = PlayResult()
        return playResult
    }

    fun play(inputBallList: List<Ball>): MutableList<Ball.BallStatus> {
        val ballStatusList = mutableListOf<Ball.BallStatus>()
        for(input in inputBallList){
            val play = baseBall.play(input)
            if (play != null) {
                ballStatusList.add(play)
            }
        }
        return ballStatusList
    }


}
