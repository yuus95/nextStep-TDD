package racing

class Car {
    var name: String = ""
    fun buildName(inputName: String) {
        if (inputName.length > 5) {
            throw IllegalArgumentException()
        }
        name = inputName
    }
}
