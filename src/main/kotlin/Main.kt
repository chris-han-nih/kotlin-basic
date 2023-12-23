import delegation.CSharpProgrammer
import delegation.JavaProgrammer
import delegation.Manager

fun main() {
  val doe = Manager(CSharpProgrammer())
  val roe = Manager(JavaProgrammer())
  doe.work()
  doe.meeting()
  roe.work()
  roe.meeting()
}
