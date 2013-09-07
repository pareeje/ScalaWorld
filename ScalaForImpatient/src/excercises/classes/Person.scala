package excercises.classes

class Person(age : Int){
	
	var actualAge = abs(age)
	
	def abs(age : Int) = {
	  if(age<0) 0 else age
	}
	
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