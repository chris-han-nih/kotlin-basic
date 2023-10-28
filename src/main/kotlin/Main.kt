fun main(args: Array<String>){
    println("Hello World!")
    println("Number of processors: ${Util.numberOfProcessors()}")
    val car = Car(2019, "")
    car.color = "Red"
    println("Car color: ${car.color}")
}

object Util {
    fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}

class Car(val yearOfMake: Int, color: String) {
    var color = color
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException("Color cannot be blank")
            }
            field = value
        }
}
