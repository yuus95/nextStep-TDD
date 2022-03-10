package racing

class Racing {
    var carList = mutableListOf<Car>()
    fun buildCarList(nameList: String) {
        val carNameList = nameList.split(",")
        carNameList.forEach {
            carList.add(Car())
            carList.last().buildName(it)
        }
    }
}
