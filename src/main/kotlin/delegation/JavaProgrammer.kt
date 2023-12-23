package delegation

class JavaProgrammer: Worker {
  override fun work() {
    println("I'm coding in Java.")
  }

  override fun takeVacation() {
    println("I'm taking a vacation.")
  }
}
