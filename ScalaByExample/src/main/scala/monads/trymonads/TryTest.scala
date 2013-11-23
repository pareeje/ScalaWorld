package monads.trymonad

import scala.util._

class TryTest {
  
	def getValue( x : Int ) : Try[Int] = {
	  if (x % 2 == 0) Success(x * 2) else Failure(new NumberFormatException)//throw new NumberFormatException("No")
	}
	
	def fetchValue( t : Int ) : Any = {
	  getValue(t) match {
	    case Success(x) => x
	    case e => "No value"
	  }
	}
	
}
