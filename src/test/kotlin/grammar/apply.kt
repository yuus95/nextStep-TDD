package grammar

import org.junit.jupiter.api.Test

class apply {
    class Person(var name: String = "", var age: Int = 0) {
    }

    @Test
    fun normalPrint() {
        //given
        val person = Person()
        person.name = "유신"
        person.age = 29
        println(person.name)
        println(person.age)
    }

    @Test
    fun applyPrint() {
        //given
        val person = Person("유신", 29)
        with(person) {
            println(person.name)
            println(person.age)
        }
    }


    @Test
    fun applyPrint2() {
        //given
        val person = Person()
        person.name = "유신"
        person.age = 27
        with(person) {
            println(person.name)
            println(person.age)
        }
    }
}