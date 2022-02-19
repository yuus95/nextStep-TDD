package string

import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.InputStreamReader


class String {


    @Test
    fun `System in, System Out Test`() {
        val inputStream = "1+2+3".byteInputStream()
        val test = BufferedReader(InputStreamReader(inputStream)).readLine()
        println(test)
        //when

        //then
    }

}