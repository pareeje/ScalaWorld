package exercises.objects

class UnitConversion {
	def convert(value : Double) = {0.0}
}

object InchesToCentimeters extends UnitConversion{
  override def convert(value : Double) = {value*2.54}
  def display(from:Double,to:Double) = from + " Inches is equal to " + to + " cms."
}

object GallonsToLiters extends UnitConversion{
  override def convert(value : Double) = {value*3.79}
  def display(from:Double,to:Double) = from + " Gallons is equal to " + to + " Litres."
}

object MilesToKilometers extends UnitConversion{
  override def convert(value : Double) = {value*1.6}
  def display(from:Double,to:Double) = from + " Miles is equal to " + to + " Kms."
}

object testUnitConversions extends App{
  val value = 2.0
  println(InchesToCentimeters.display(value,InchesToCentimeters.convert(value)))
  println(GallonsToLiters.display(value,GallonsToLiters.convert(value)))
  println(MilesToKilometers.display(value,MilesToKilometers.convert(value)))
}