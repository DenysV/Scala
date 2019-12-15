object Ex1 extends  App{

  def sum_numbers(num_1: Int, num_2: Int) : Int = {
    val res : Int = num_1 + num_2
    return  res
  }

  override def main(args: Array[String]): Unit = {
    var a : Int = 0
    var b : Int = 0
    println(sum_numbers(a, b))
  }
}
