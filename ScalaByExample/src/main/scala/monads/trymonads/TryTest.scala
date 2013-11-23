package monads.trymonad

import scala.util._

class TryTest {
  
	def getValue( x : Int ) : Try[Int] = {
	  if (x % 2 == 0) Success(x * 2) else throw new NumberFormatException("No")
	}
	
	def fetchValue( t : Int ) = {
	  getValue(t) match {
	    case Success(x) => x
	    case Failure(e) => e
	  }
	}
	
}
