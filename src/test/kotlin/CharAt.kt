import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CharAt {

    @Test
    fun `charAt()`() {
        val result = "abc"[0]
        println(result)
    }

    @Test
    fun `charAt error`() {
        val result = "abc"
        Assertions.assertThrows(StringIndexOutOfBoundsException::class.java) { result[3] }
    }
}