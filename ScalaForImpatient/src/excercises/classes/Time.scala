package excercises.classes

class Time(val hours : Int = 0, val minutes : Int = 0) {
	val convertedTimeInMinutes = hours * 24 + minutes
	
	def before(other : Time) = convertedTimeInMinutes < other.convertedTimeInMinutes 
	
	override def toString = "Time is: Hours: " + hours + " Minutes: " + minutes;
}

object TimeComp{
  def main(args : Array[String]){
    val time = new Time(12,0)
    val other = new Time(12,1)
    println(time)
    println(other)
    println(time.before(other))
  }
}
