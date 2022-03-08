package baseball

import org.junit.jupiter.api.Test

class FilterTest {


    @Test
    fun filter(){
        //given
        val list = mutableListOf<String>("1","2","3")
        val result = list.filter { it.toInt() % 2 == 0  }
        println(result)
    }


    @Test
    fun errorTest(){
        //given
        fun error():Nothing=throw IllegalStateException("testError")
        val noNulll: String = error()
        println("noNulll == ${noNulll}")
        //when

        //then
    }


    @Test
    fun nullPoint(){

        class TestA {
            val a = true
            fun testPrint(input:String?):String?{
                if(input != null){
                    return "123"
                }
                return null
            }
        }
        //given
        val a = null
        val b = null
        val c = TestA()


        val test = a?:b?:c.testPrint(null)

        println(test)
        //when

        //then
    }
}