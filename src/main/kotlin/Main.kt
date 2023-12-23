fun main(){
    MachineOperator("Mater").checkin()
    println(MachineOperator.minimum())
    println(MachineOperator.checkedIn)

    val ref = MachineOperator.Companion
    println(ref.checkedIn)
}

class MachineOperator(val name: String) {
    fun checkin() = checkedIn++
    fun checkout() = checkedIn--
    companion object {
        var checkedIn = 0
        fun minimum() = "15 minutes every 2 hours"
    }
}
