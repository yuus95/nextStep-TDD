package baseball

import org.junit.jupiter.api.Test

class RandomNumber {


    @Test
    fun randomNumber() {
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
        println(randomList)
    }
}