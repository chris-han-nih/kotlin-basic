fun main() {
    println(max(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(max())

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(max(*numbers))

    val numbers2 = listOf<Int>(1,2,3,4,5,7,3,72,2,4,77)
    println(max(*numbers2.toIntArray()))

    val (first, middle, last) = fullName()
    println("$first $middle $last")

    val aToz: CharRange = 'a'..'z'
    for (c in aToz) {
        print(c)
    }
    println()

    for (n in 1..10) {
        print(n)
    }
    println()

    for (n in 10 downTo 1) {
        print(n)
    }
    println()
}

fun fullName() = Triple("John", "Quincy", "Adams")

fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (n in numbers) {
        large = if (n > large) n else large
    }

    return large
}
