package excercises.classes

class Time(private var hours : Int = 0, private var minutes : Int = 0) {
  
	var m = hours * 60 + minutes
	def before(other : Time) = {
	 hours * 60 + minutes < other.hours * 60 + other.minutes
	}
	
	def hourVal = m/60
	def minuteVal = m%60
}

object TimeComp{
  def main(args : Array[String]){
    val time = new Time(12,0)
    val other = new Time(12,1)
    println(time.hourVal + ":" + time.minuteVal)
    println(time.before(other))
  }
}