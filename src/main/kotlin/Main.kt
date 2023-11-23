fun main(){
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)

    println(Person.AGE.toString())
}

fun calculate(): Int {
    println("Calculating...")
    return 1
}

val fizz = calculate()
val buzz
    get() = calculate()

enum class Person {
    NAME,
    AGE,
}
