package bool

abstract class Boolean {
	def ifThenElse[T](t : => T, e: => T) : T
	
	def && ( x: => Boolean ) : Boolean = ifThenElse(x,False)
	def || ( x: => Boolean ) : Boolean = ifThenElse(True,x)
	def unary_! : Boolean = ifThenElse(False,True)
	
	def == ( x: => Boolean) : Boolean = ifThenElse(x, x.unary_!)
	def != (x: =>Boolean) : Boolean = ifThenElse(x.unary_!,x)
	
	def < (x: => Boolean) : Boolean = ifThenElse(False,x)
}

object False extends Boolean {
   def ifThenElse[T](t: => T, e: => T) = e
}

object True extends Boolean {
  def ifThenElse[T](t: => T, e: => T) : T = t
}