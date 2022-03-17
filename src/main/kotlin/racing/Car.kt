package racing

class Car {
    var name: String = ""
    var score  = 0
    fun buildName(inputName: String) {
        if (checkNameLength(inputName)) {
            throw IllegalArgumentException()
        }
        name = inputName
    }

    fun getScore(randomNumber: Int) {
        if(checkRandomNumberLength(randomNumber)){
            score+=1
        }
    }

    private fun checkNameLength(inputName: String):Boolean{
        return inputName.length > CAR_MAX_LENGTH
    }

    private fun checkRandomNumberLength(randomNumber: Int):Boolean{
        return randomNumber >= 4
    }

    companion object{
        const val CAR_MAX_LENGTH = 5
    }
}
