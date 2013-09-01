package exercises.mapsntuples

object LessGreaterEqual {
	def main(args : Array[String]){
	  val elem = Array(10,30,2,4,5,6,9,46,73,1,100)
	  val t = lteqgt(elem,4)
	  println("Count of values ....")
	  printf("Greater than %d + Less than %d + Equals to %d", t _2, t _1, t _3)
	}
	
	def lteqgt(values: Array[Int], v: Int) = {
	  (values.count(_ < v), values.count(_ > v), values.count(_ == v))
	}
}