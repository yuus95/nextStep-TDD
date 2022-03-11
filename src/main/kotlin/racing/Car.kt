package racing

class Car {
    var name: String = ""
    var number = 0
    fun buildName(inputName: String) {
        if (inputName.length > 5) {
            throw IllegalArgumentException()
        }
        name = inputName
    }

    fun getScore(randomNumber: Int) {
        if(randomNumber >= 4){
             number+=1
        }
    }
}
