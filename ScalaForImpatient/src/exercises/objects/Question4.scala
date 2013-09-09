package exercises.objects

class Point(val x:Int,val y:Int) {
}

object Point{
  val point = Point(3,4)
  def display() {println("Point coordinates : " + point.x + "," + point.y)}
  def apply(x:Int,y:Int) = {
    new Point(x,y)
  }    
}

object testPoint extends App{
  Point.display()
}