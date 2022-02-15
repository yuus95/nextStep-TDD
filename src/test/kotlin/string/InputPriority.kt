package string

import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.util.*
import kotlin.String


class InputPriority {


    @Test
    fun `입력 우선 순위 계산기`(){
        //given
        val data: String = "2 + 3 * 4 / 2"
        val stdin = System.`in`
        System.setIn(ByteArrayInputStream(data.toByteArray()))
        val scanner = Scanner(System.`in`)
        System.setIn(stdin)
        println(scanner.nextLine())

        //when

        //then
    }
}