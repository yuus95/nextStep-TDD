package racing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class RacingTest {
    private var car = Car()
    private var racing = Racing()
    val carNameList = "K5,K3,SM3"

    @Test
    @DisplayName("각 자동차에 이름부여하기")
    fun createCarName() {
        this.car.name = "Porsh"
        Assertions.assertEquals(car.name, "Porsh")
    }

    @Test
    @DisplayName("이름을 5글자로 제한하기")
    fun limitNameToFiveChracters() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            car.buildName("Porshe")
        }
    }

    @Test
    @DisplayName("자동차이름 쉼표로 구분하기")
    fun buildCarList() {
        racing.buildCarList(carNameList)
        Assertions.assertEquals(racing.carList[0].name, "K5")
        Assertions.assertEquals(racing.carList[1].name, "K3")
        Assertions.assertEquals(racing.carList[2].name, "SM3")
    }

    @Test
    fun carGetScore() {
        car.getScore(4)
        Assertions.assertEquals(car.score, 1)
    }

    @Test
    fun carGetScore_fail() {
        car.getScore(3)
        Assertions.assertEquals(car.score, 0)
    }

    @Test
    fun carListPlay() {
        racing.buildCarList(carNameList)
        racing.play()
        for (x in racing.carList) {
            println("car score ${x.score}")
        }
    }

    @Test
    fun repeatPlay() {
        //given
        racing.buildCarList(carNameList)
        racing.repeatPlay(5)
        for (x in racing.carList) {
            println("car score ${x.score}")
        }
    }

    @Test
    fun getResultToRacingWin() {
        racing.buildCarList(carNameList)
        racing.carList[0].score = 1
        racing.carList[1].score = 2
        racing.carList[2].score = 3
        Assertions.assertEquals(racing.getResult(),"SM3")
    }
}