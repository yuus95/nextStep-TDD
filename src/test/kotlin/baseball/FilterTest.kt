package baseball

import org.junit.jupiter.api.Test

class FilterTest {


    @Test
    fun filter(){
        //given
        val list = mutableListOf<String>("1","2","3")
        val result = list.filter { it.toInt() % 2 == 0  }
        println(result)
        //when

        //thenx
    }
}