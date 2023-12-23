package remote

interface Remote {
    fun up()
    fun down()
    fun doubleUp() {
        up()
        up()
    }
}
