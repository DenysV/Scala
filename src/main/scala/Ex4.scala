object Ex4 extends App {
  def sum_list(mylist: List[Int]): Int = {
    var length_list : Int = mylist.size
    var res : Int = 0

    if (length_list == 0) {
      res = 0
    } else if (length_list == 1) {
      res = mylist.head
    } else {
      val element_first = mylist.head
      val nohead_in_mylist = mylist.slice(1, mylist.size)
      res = element_first + sum_list(nohead_in_mylist)
    }
    return  res
  }

  override def main(args: Array[String]): Unit = {
    var input_list : List[Int] = List(3,5,7,9)
    println(sum_list(input_list))
  }
}
