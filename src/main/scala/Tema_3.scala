import scala.io.StdIn

object Tema_3 {

  case class Rectangle(base: Float = 2, altura: Float = 3, color: String = "blue") {
    def calculateArea(a: Float, b: Float) = a * b

    var area = calculateArea(altura, base)
  }

  case class Triangle(base: Float = 4, altura: Float = 3, color: String = "yellow") {
    def calculateArea(a: Float, b: Float) = a * b / 2

    var area = calculateArea(altura, base)
  }

  case class Circle(radius: Float = 3, color: String = "red") {
    def calculateArea(a: Float) = Math.PI * a * a

    var area = calculateArea(radius)
  }

    val RECTANGLE: Int = 1
    val CIRCLE: Int = 2
    val TRIANGLE: Int = 3
    val COMPARISON: Int = 4
    val EXIT: Int = 5

    def compareRectangleTriangle(rectangle: Rectangle, triangle: Triangle): Boolean = {
      rectangle.area > triangle.area
    }

    def compareRectangleWithLimite(rectangle: Rectangle, limit: Int): Boolean = {
      rectangle.area > limit
    }

    def main(args: Array[String]): Unit = {
      var operation: Int = 0
      var output: Boolean = false
      val rectangle: Rectangle = Rectangle()
      val triangle: Triangle = Triangle()
      val circle: Circle = Circle()

      while (!output) {
        println("Please select type of figure for comparison.")
        println("1: Rectangle")
        println("2: Circle")
        println("3: Triangle")
        println("4: Comparison")
        println("5: Exit")
        operation = StdIn.readInt()

      operation match {
        case RECTANGLE =>
          println("Rectangle: " + rectangle.color)
          println("Base: " + rectangle.base)
          println("Altura: " + rectangle.altura)
          println("Area:" + rectangle.area)
        case CIRCLE =>
          println("Circle: " + circle.color)
          println("Radius: " + circle.radius)
          println("Area:" + circle.area)
        case TRIANGLE =>
          println("Triangle: " + triangle.color)
          println("Base: " + triangle.base)
          println("Altura: " + triangle.altura)
          println("Area:" + triangle.area)
        case COMPARISON =>
          if (compareRectangleTriangle(rectangle, triangle)) {
            println("Area of rectangle is bigger than area of triangle.")
          } else {
            println("Area of triangle is not bigger than area of rectangle.")
          }
          if (compareRectangleWithLimite(rectangle, 5)) {
            println("Area of rectangle is bigger than limit of 5.")
          } else {
            println("Area of rectangle is smaller than limit of 5.")
          }
        case EXIT =>
          println("Exit.")
          output = true
        }
      }
    }
}