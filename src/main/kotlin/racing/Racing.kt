package racing

class Racing {
    var carList = mutableListOf<Car>()
    fun buildCarList(nameList: String) {
        val carNameList = nameList.split(",")
        buildRepeatCar(carNameList)
    }

    private fun buildRepeatCar(carNameList: List<String>) {
        carNameList.forEach {
            val tempCar = Car()
            tempCar.buildName(it)
            carList.add(tempCar)
        }
    }
}
