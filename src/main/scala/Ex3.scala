object Ex3 extends App {
  def fib_rec(n: Int): Int = {
    var res : Int = 0
    if (n < 0){
      throw new IllegalArgumentException("n must be great of 0")
    } else if (n == 0){
      res = 0
    } else if (n == 1){
      res = 1
    } else {
      res = fib_rec(n-1) + fib_rec(n-2)
    }
    return res
  }

  override def main(args: Array[String]): Unit = {
    var n : Int = 9
    println(fib_rec(n))
  }
}
