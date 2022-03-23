package racing

import org.junit.jupiter.api.Test

class CarTest:Car() {
    override fun testProtected(): Int {
        return 10
    }

    @Test
    fun protectedPrepare(){
        val test = CarTest()
        print(test.testProtected())
    }
}