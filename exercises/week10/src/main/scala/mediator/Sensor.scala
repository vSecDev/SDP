package mediator

//import org.scalatest.Fact.Binary_&

class Sensor {

  def checkTemperature(temp: Int): Boolean = {
    println("Temperature reached " + temp + "C.")
    true
}
}