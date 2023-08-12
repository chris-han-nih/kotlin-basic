fun main() {
    for (i in (1 until 20 step 2).filter { it % 3 == 0 }.indices) {
        println("Hello, World $i")
    }
}
