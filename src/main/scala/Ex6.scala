object Ex6 extends App {
  def decTobinary(n : Int) : String = {
    var res : String = ""

    if (n < 2) {
      res = n.toString
    }  else{
      res = decTobinary(n / 2).toString.concat((n % 2).toString)
    }
    return  res
  }

  override def main(args: Array[String]): Unit = {
    var n : Int = 5
    println(decTobinary(n))
  }
}