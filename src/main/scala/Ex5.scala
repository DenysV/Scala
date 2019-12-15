object Ex5 extends App{
  def invert(n : Int) : Int = {
    var res : Int = 0
    if (n < 10) {
      res = n
    } else {
      res = (n % 10)
          .toString
          .concat(invert(n / 10).toString)
          .toInt
    }
    return res
  }

  override def main(args: Array[String]): Unit = {
    var n : Int = 3579
    println(invert(n))
  }
}
