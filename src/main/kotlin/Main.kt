fun main(args: Array<String>){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (idx in items.indices) {
        println("item at $idx is ${items[idx]}")
    }

    println(describe("hello"))
    println(describe(200))
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
