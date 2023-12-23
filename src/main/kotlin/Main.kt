import machineoperator.MachineOperator

fun main(){
    val operator1 = MachineOperator.create("John")
    val operator2 = MachineOperator.create("Jane")
    println("Checked in: ${MachineOperator.checkedIn}")
}
