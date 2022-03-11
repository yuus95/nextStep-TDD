package racing

class Car {
    var name: String = ""
    var score = 0
    fun buildName(inputName: String) {
        if (inputName.length > 5) {
            throw IllegalArgumentException()
        }
        name = inputName
    }

    fun getScore(randomNumber: Int) {
        if(randomNumber >= 4){
             score+=1
        }
    }
}
