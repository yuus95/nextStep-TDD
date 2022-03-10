package racing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class RacingTest {
    private var car = Car()

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
    fun buildCarList(){
        val carNameList = "K5,K3,SM3"
        val racing = Racing()
        racing.buildCarList(carNameList)
        Assertions.assertEquals(racing.carList[0].name,"K5")
        Assertions.assertEquals(racing.carList[1].name,"K3")
        Assertions.assertEquals(racing.carList[2].name,"SM3")
    }
}