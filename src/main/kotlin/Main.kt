fun main(){
    val player = Player("Madrigal")
    println(player.name)
    player.score = 10
    player.score = -1
    println(player.score)

    val message = "Hello Kotlin"
    println(message.hidePassword())
}

class Player(val name: String) {
    var score: Int = 0
        set (value) {
            if (value >= 0) field = value
        }
}

fun String.hidePassword(): String = "*".repeat(this.length)
