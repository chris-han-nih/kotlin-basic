package machineoperator

class MachineOperator private constructor(val name: String) {

    fun checkin() {
        checkedIn = checkedIn + 1
    }

    companion object {

        var checkedIn = 0

        fun create(name: String): MachineOperator {
            val instance = MachineOperator(name)
            instance.checkin()
            return MachineOperator(name)
        }
    }
}
