object Ex2 extends App {
  def checkAge(age : Int) : Unit = {
    if (age >= 18) {
      println(s"You are adult.")
    } else {
      println(s"You are adolescent.")
    }
  }

  override def main(args: Array[String]): Unit = {
    val young: Int = 12
    val old: Int = 21
    val adolescent: Int = 18

    checkAge(young)
    checkAge(old)
    checkAge(adolescent)
  }
}
