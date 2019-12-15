abstract class Vehiculo{
  var color: String
  var weigth: Int
}

class Car(NumberWheels: Int, c: String, w: Int) extends Vehiculo{
  var color = c
  var weigth = w
}

class Boat(NumberSails: Int, c: String, w: Int) extends Vehiculo{
  var color = c
  var weigth = w
}

object Tema_5{

  def returnColor(v: Vehiculo) = v.color
  def returnWeight(v: Vehiculo) = v.weigth

  def main(args: Array[String]): Unit = {
    var Car1= new Car(4, "rojo", 1500)
    var Boat1= new Boat(2, "azul", 2000)

    val vehiculos: List[Vehiculo] = List(new Car(4, "black", 2500),
      new Car(4, "white",3000), new Boat(2, "yellow", 15),
      new Boat(2, "green", 20))

    vehiculos.foreach{vehiculo =>
      println(returnColor(vehiculo))
      println(returnWeight(vehiculo))}
  }
}
