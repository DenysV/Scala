object Tema6 extends App {
  abstract class Transport
  case class Car(Company: String, Brend: String, Registration: String, Mileage: Int, Gas: String,
                 Price: Double) extends Transport
  case class Motorbike(Company: String, Brend: String, Registration: String, Price: Double) extends Transport
  case class Bus(Company: String, Brend: String, Registration: String, NumberOfPassenger: Int,
                 Price: Double) extends Transport
  case class Train(Line: Int, NumberOfCoches: Int, NumberOfPassenger: Int, Price: Double) extends Transport
  case class Plane(Airlines: String, Origin: String, Destination: String, NumberOfPassenger: Int, Distance: Int,
                   Price: Double) extends Transport
  case class Ship(ShippingCompany: String, Cargo: String, Origin: String, Destination: String,
                   Price: Double) extends Transport

  val car = Car("Uber", "Audi", "3135BJD", 18500, "Diesel", 2.57)
  val bus = Bus("ALSA", "Mercedes", "1249IO", 42, 2.50)
  val moto = Motorbike("Moto", "JarlyDevidson", "RX5698", 1.87)
  val train = Train(3, 4, 64, 1.56)
  val plane = Plane("Iberia", "Madrid", "London", 157, 4000, 23.47)
  val ship = Ship("Ocean", "wert", "Barcelona", "Buenos Aires", 45.73)

  def priceCar(company: String, brend: String, registration: String, distance: Int, petrol: String, price: Double): Unit ={
    if(petrol == "Diesel" || petrol == "Sin plumo 95" || petrol == "Sin plumo 98"){
      println("Spending " + petrol + " in " + distance + " kilometers: " + distance * price)
    }
      /*
    else if(petrol == "Sin plumo 95"){
      println("Spending " + petrol + " in " + distance + " kilometers: " + distance * price)
    }
    else if(petrol == "Sin plumo 98"){
      println("Spending " + petrol + " in " + distance + " kilometers: " + distance * price)
    }
      */
    else{
      println("Special type of gas.")
    }
  }

  def priceBus(company: String, brend: String, registration: String, passengers: Int, price: Double): Unit ={
    if(brend == "Scania" || brend == "Renaut" || brend == "Volvo" || brend == "Wolkswagen"){
      println("Model " + brend + " -> Price of ticket " + price + ", number of passenger: " + passengers +
        ". Earning per way: " + price * passengers)
    }
    else{
      println("Other model -> Price of ticket " + price + ", number of passenger: " + passengers +
        ". Earning per way: " + price * passengers)
    }
  }

  def priceTrain(line: Int, coches: Int, passengers: Int, price: Double): Unit = {
    if (line == 1) {
      println("Price of line " + line + " is " + price)
    }
    else if (line == 2) {
      println("Price of line " + line + " is " + price)
    }
    else if (line == 3) {
      println("Price of line " + line + " is " + price)
    }
    else{
      println("Price of line is " + price)
    }
  }

  def otherwice(){
    {
      println("No avaiable to count price of trip.")
    }
  }

  lazy val myCar = priceCar(car.Company, car.Brend, car.Registration, car.Mileage, car.Gas, car.Price)
  lazy val ourTrain = priceTrain(train.Line, train.NumberOfCoches, train.NumberOfPassenger, train.Price)
  lazy val ourBus = priceBus(bus.Company, bus.Brend, bus.Registration, bus.NumberOfPassenger, bus.Price)

  def test(x: Any): Unit = x match{
    case Car(_, _, _, _, "Diesel", _) => myCar
    case Car(_, _, _, _, "Sin plumo 95", _) => myCar
    case Car(_, _, _, _, "Sin plumo 98", _) => myCar
    case Car(_, _, _, _, _, _) => myCar
    case Train(1, _, _, _) => ourTrain
    case Train(2, _, _, _) => ourTrain
    case Train(3, _, _, _) => ourTrain
    case Train(_, _, _, _) => ourTrain
    case Bus(_, "Volvo", _, _,_) => ourBus
    case Bus(_, "Scania", _, _,_) => ourBus
    case Bus(_, "Renaut", _, _,_) => ourBus
    case Bus(_, "Wolkswagen", _, _,_) => ourBus
    case Bus(_, _, _, _,_) => ourBus
    case _ => otherwice
  }

  test(car)
  test(bus)
  test(train)
  test(plane)
  test(moto)
  test(ship)

}
