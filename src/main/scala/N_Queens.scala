import scala.collection.mutable.ArrayBuffer

object N_Queens {
  type row = Int
  type col = Int

  def queens(n: Int): Set[List[(row, col)]]={
    def colorQueen(k: Int): Set[List[(row, col)]]={
      if (k < 0){
        Set(List())
      }else{
        for{
          queens <- colorQueen(k - 1)
          col <- 0 until n
          queen = (k, col)
          if factible(queen, queens)
        }
          yield queen::queens
      }
    }

    def factible(queen:(row, col), queens:List[(row, col)]):Boolean={
      queens.forall{
        queenOk => queenOk._1 != queen._1 && queenOk._2 != queen._2 && (Math.abs(queenOk._1 - queen._1) != Math.abs(queenOk._2 - queen._2))
      }
    }
    colorQueen(n - 1)

  }

  def seeSolution(n: Int, solutions: Set[List[(row, col)]])={
    for(queens <- solutions){
      println("@@@@@@@@@@@@@")
      for(row <- 0 until n){
        val buffer = new ArrayBuffer[String]()
        for(col <- 0 until n){
          if(queens.contains((row, col))){
            buffer.append("1")
          }
          else{
            buffer.append("*")
          }
        }
        println(buffer.mkString(" "))
      }
    }
  }

  def main(args: Array[String]): Unit ={
    val solutions = queens(8)
    seeSolution(8, solutions)
    println(s"Number of solutions: ${solutions.size}")
  }

}
