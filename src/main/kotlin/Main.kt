fun main(){
    println(Util.numberOfProcessors())
    val (year, color) = useCarObject()
    println("Year: $year, Color: $color")
}

object Util {
    fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}

fun useCarObject(): Pair<Int, String> {
    val car = Car(2019, "red")
    val year = car.yearOfMake
    val color = car.color
    return year to color
}

class Car(val yearOfMake: Int, var color: String)
