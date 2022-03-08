package baseball

class PlayResult {
    private var ball = 0
    private var strike = 0

    fun getBall():Int{
        return ball
    }

    fun addBall(){
        ball +=1
    }

    fun addStrike(){
        strike +=1
    }

    fun getStrike():Int{
        return strike
    }
}
