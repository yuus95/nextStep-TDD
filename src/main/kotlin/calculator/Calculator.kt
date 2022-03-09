package calculator

class Calculator {

    companion object {
        fun splitAndSum(text: String?): Int {

            if (text == null || text.isEmpty()) {
                return 0
            }
            if (text.length == 1) {
                return text.toInt()
            }
            val makeNumberList = buildNumberList(text)
            return buildSum(makeNumberList)
        }

        private fun buildSum(makeNumberList: List<String>): Int {
            var sum = 0
            for (num in makeNumberList) sum += num.toInt()
            return sum
        }

        private fun buildNumberList(text: String): List<String> {
            if (checkCustomSeparator(text)) {
                val condition = "//(.)\n(.*)"
                val regex = Regex(condition)
                val match = regex.find(text)
                return match!!.groupValues[2].split(text[2])
            }
            return text.split(",", ":")


        }

        private fun checkCustomSeparator(input: String?): Boolean {
            val regex = Regex("//(.)\n(.*)")
            if (input != null && regex.find(input)?.value?.isNotEmpty() == true) {
                return true
            }
            return false
        }
    }
}
