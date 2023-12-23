package remote

class TV(
    var volume: Int = 0,
)

class TVRemote(val tv: TV): Remote {
    override fun up() { tv.volume++ }
    override fun down() { tv.volume-- }
}
