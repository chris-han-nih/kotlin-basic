package delegation

class Manager(
  private val staff: Worker,
): Worker by staff {
  fun meeting() = println("organizing meeting with ${staff::class.simpleName}")
}
