import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SubString {
    @Test
    fun `'(1,2)' subString`() {
        val result = "(1,2)".substring(1, 4)
        Assertions.assertEquals(result,"1,2")
    }
}