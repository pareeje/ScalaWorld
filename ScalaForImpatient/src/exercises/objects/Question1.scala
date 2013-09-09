package exercises.objects

object Conversions extends App{
  
  println("12 Inches = " + inchesToCentimeters(12) + " cms")
  println("10 gallons = " + gallonsToLiters(10) + " litres")
  println("1.2 miles = " + milesToKilometers(1.2) + " Kms")
  
  def inchesToCentimeters(inches : Int) = {
	  inches*2.54
  }

  def gallonsToLiters(gallons : Int) = {
    gallons * 3.79
  }
  
  def milesToKilometers(miles : Double) = {
    miles * 1.6
  }
}