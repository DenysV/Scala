object Tema2 extends App {
  val first_list = 2::12::4::81::5::Nil
  val second_list = List(11, 33, 22, 44, 33)
  class Age{
    def lastNumber(x: List[Int], y: List[Int]): Int ={
      val w = x++y
      val multiply = for (e <- w) yield e * 2
      println("Max value: " + f"${multiply.max}")
      println("Min value: " + f"${multiply.min}")
      println("Last value: " + f"${multiply.last}")
      return multiply.last
    }
  }

  class Test(x: List[Int], y: List[Int]) extends Age{
    val argument = lastNumber(x, y)

    argument match {
      case 50 => println("First solution: " + f"$argument")
      case 1 => println("Second solution: " + f"$argument")
      case 100 => println("Third solution: " + f"$argument")
      case _ => println("Other solution: " + f"$argument")
    }
  }

  val test_1 = new Test(first_list, second_list)
}
