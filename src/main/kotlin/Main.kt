import java.util.*

fun main(){
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)

    println(Person.AGE.toString())

    val str = "Convert this to   camelcase"
    println(str.spaceToCamelCase())
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

fun String.spaceToCamelCase(): String {
    val words = this.split(" ")
    val camelCase = words.mapIndexed{idx, word ->
        if (idx == 0) {
            word.lowercase()
        } else {
            word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    }
    return camelCase.joinToString("")
}