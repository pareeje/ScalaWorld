package excercises.classes

class Person(ageParameter : Int){
	var actualAge = if(ageParameter < 0) 0 else ageParameter
	
	def seeAge = println(actualAge)
}

object PersonComp{
  def main( args : Array[String]){
    val p = new Person(10)
    p.seeAge
    val p2 = new Person(-60)
    p2.seeAge
  }
}
