package excercises.classes

class Counter(private var value : Int = 0) {
	def increment() { if(value < Int.MaxValue ) value += 1 } // Methods are public by default
	def current = value
}

object CounterComp{
  def main(args : Array[String]){
    val c = new Counter(Int.MaxValue - 1)
    c.increment()
    println(c.current)
    c.increment()
    println(c.current)
  }
}