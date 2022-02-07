import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CharAt {


    @Test
    fun `charAt()`() {
        //given
        val result = "abc"[0]
        println(result)
        //when
        //then
    }


    @Test
    fun `charAt error`() {
        //given
        val result = "abc"
        Assertions.assertThrows(StringIndexOutOfBoundsException::class.java) { result[3] }
        //when

        //then
    }
}