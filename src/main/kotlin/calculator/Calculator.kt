package calculator

class Calculator {
    val condition = "[1-9]"
    val regex = Regex(condition)

    companion object {
        fun splitAndSum(text: String?): Int {
            if (text == null || text.isEmpty()) {
                return 0
            }
            if(text.length == 1){
                return text.toInt()
            }
            val numberList = text.split(",",":")
            var result = 0
            for (x in numberList) result+= x.toInt()

            return result
        }
    }
}
