package pattern

import org.junit.jupiter.api.Test
import java.util.regex.Matcher
import java.util.regex.Pattern

class PatternTest {
    @Test
    fun pattern() {
        //given
        val m: Matcher = Pattern.compile("//(.)\n(.*)").matcher("//;\n1;2;3")
        if (m.find()) {
            val customDelimiter: String = m.group(1)
            val tokens: List<String> = m.group(2).split(customDelimiter)
            println(m.group(2))
            println(tokens)
            // 덧셈 구현
        }
    }

            @Test
            fun regex() {
                val str = "//;\n1;2;3"
                val condition = "//(.)\n(.*)"
                val regex = Regex(condition)
                if (regex.containsMatchIn(str)) {
                    val find: MatchResult? = regex.find(str)
                    println(find!!.value[0])
        }
    }

    @Test
    fun numberFiltering(){
        //given
        val numberFilter =  Regex("^[1-9]+$")
        if(numberFilter.containsMatchIn("1234")){
            println(true)
        }
    }
}