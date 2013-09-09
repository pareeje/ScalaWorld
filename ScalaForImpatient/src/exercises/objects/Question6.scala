package exercises.objects

object Question6 extends Enumeration {
  
	type Question6 = Value
	val Spade = Value("♠")
	val Club = Value("♣")
	val Heart = Value("♥")
	val Diamond = Value("♦")
	
	override def toString() = {
	  var s = ""
	  for(e <- Question6.values) {s += e.toString() }
	  s
	}
}

object testQuestion6 extends App{
  println(Question6.toString())
}