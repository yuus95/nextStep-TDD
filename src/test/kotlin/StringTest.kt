import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringTest {

    @Test
    fun `'1,2'split()`(){
        //given
        val splitString = "1,2".split(",")
        println(splitString)
        //when

        //then
    }

    @Test
    fun `'1,'split()`(){
        //given
        val splitString = "1,".split(",")
        //when
        println(arrayOf("1")[0])
        println(splitString[0])
        println(arrayOf("1").size)
        println("${splitString.size}")
        Assertions.assertArrayEquals(arrayOf(splitString) , arrayOf("1"))
        //then
    }
}