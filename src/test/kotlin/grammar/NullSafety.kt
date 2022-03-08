package grammar

import org.junit.jupiter.api.Test

class NullSafety {

    @Test
    fun safeCall() {
        //given
        val name: String? = null
        println("${name?.length}")
        if (name == null) {
            println("123")
        }
        println("$name")
    }


    @Test
    fun Elvis() {
        //given
        val name: String? = null
        val testName = name ?: "name이 null이면 이값을 반환"
        println(testName)
    }
}