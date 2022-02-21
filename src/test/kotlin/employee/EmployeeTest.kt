package employee

import org.junit.jupiter.api.Test
import java.math.BigDecimal

class EmployeeTest {
    abstract class Employee {
        var name: String = ""
        var money: Money = Money(BigDecimal(0))
        abstract fun buildSalary()
        abstract fun confirmAccessLevel(): Boolean
    }

    class Money(
        var amount: BigDecimal = BigDecimal(0)
    )

    interface EmployeeFactory {
        fun buildEmployee(employeeLevel: String): Employee
    }

    class EmployeeFactoryImpl : EmployeeFactory {
        override fun buildEmployee(employeeLevel: String): Employee {
            return when (employeeLevel) {
                "INTERN" -> {
                    Intern()
                }
                "FULLTIME" -> {
                    FullTimeEmployee()
                }
                else -> {
                    throw IllegalAccessError("잘못된 접근방식입니다.")
                }
            }
        }
    }

    class Intern : EmployeeTest.Employee() {
        override fun buildSalary() {
            this.money.amount += BigDecimal(25000000)
        }

        override fun confirmAccessLevel(): Boolean {
            return false
        }

        fun changeName(changeName: String) {
            this.name = changeName
        }
    }

    class FullTimeEmployee : EmployeeTest.Employee() {
        override fun buildSalary() {
            this.money.amount += BigDecimal(3000000)
        }

        override fun confirmAccessLevel(): Boolean {
            return true
        }

    }


    @Test
    fun buildMoney() {
        //given
        val employeeFactoryImpl = EmployeeFactoryImpl()
        val intern = employeeFactoryImpl.buildEmployee("INTERN")
        val fullTimeEmployee = employeeFactoryImpl.buildEmployee("FULLTIME")
        intern.buildSalary()
        fullTimeEmployee.buildSalary()
        //when
        println("intern == ${intern.money.amount}")
        println("fulltime == ${fullTimeEmployee.money.amount}")
        //then
    }
}