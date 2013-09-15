package practices.inheritance

abstract class CollegeMember {
	def Id : Int //abstract 
}

class Student(override val Id:Int) extends CollegeMember{
  def display {println("Id : " + Id)}
}

object StudentComp extends App{
  val s = new Student(20)
  s.display
}