package racing

class Racing {
    var carList = mutableListOf<Car>()
    fun buildCarList(nameList: String) {
        buildRepeatCar(buildSplitList(nameList))
    }

    private fun buildSplitList(nameList:String):List<String>{
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
        var maxNum = -1
        var resultList = mutableListOf<String>()
        for(i in 0 until carList.size){
            if(maxNum < carList[i].score){
                maxNum = carList[i].score
            }
        }

        for(i in 0 until carList.size){
            if(maxNum == carList[i].score){
                resultList.add(carList[i].name)
            }
        }
        return resultList.joinToString(",")
    }
}
