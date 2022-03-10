package racing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class Racing {
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
}