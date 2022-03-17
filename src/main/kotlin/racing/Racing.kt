package racing

class Racing {
    var carList = mutableListOf<Car>()
    var maxNum = -1
    var resultList = mutableListOf<String>()
    fun buildCarList(nameList: String) {
        buildRepeatCar(buildSplitList(nameList))
    }

    private fun buildSplitList(nameList: String): List<String> {
        return nameList.split(",")
    }

    private fun buildRepeatCar(carNameList: List<String>) {
        carNameList.forEach {
            val tempCar = Car()
            tempCar.buildName(it)
            carList.add(tempCar)
        }
    }

    fun repeatPlay(repeatNumber: Int) {
        for (i in 0 until repeatNumber) {
            play()
        }
    }

    fun play() {
        for (i in 0 until carList.size) {
            carList[i].getScore(buildRandomNumber())
        }
    }

    private fun buildRandomNumber(): Int {
        return (0..9).random()
    }

    fun getResult(): String {
        for (i in 0 until carList.size) {
            buildMaxNum(carList[i].score)
        }

        for (i in 0 until carList.size) {
            buildResultList(carList[i])
        }
        return resultList.joinToString(",")
    }

    private fun buildResultList(car: Car) {
        if (compareScore(car.score)) {
            resultList.add(car.name)
        }
    }

    private fun compareScore(score: Int): Boolean {
        if (maxNum == score) {
            return true
        }
        return false
    }

    private fun buildMaxNum(score: Int) {
        if (maxNum < score) {
            maxNum = score
        }
    }
}
