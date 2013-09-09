package exercises.objects

object RGBCube extends Enumeration {

  type RGBCube = Value
  val black = Value(0x000000, "Black")
  val red = Value(0xff0000, "Red")
  val green = Value(0x00ff00, "Green")
  val blue = Value(0x0000ff, "Blue")
  val yellow = Value(0xffff00, "Yellow")
  val magenta = Value(0xff00ff, "Magenta")
  val cyan = Value(0x00ffff, "Cyan")
  val white = Value(0xffffff, "White")
}

object testRGBCube{
  def main(args:Array[String]){ 
	  println(for(s <- RGBCube.values) yield s)
  }
}