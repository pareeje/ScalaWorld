package naturals

abstract class Nat {
	def isZero : Boolean
	def predecessor : Nat 
	def successor : Nat = new Succ(this)
	def +(that : Nat) : Nat
	def -(that : Nat) : Nat
}

object Zero extends Nat {
  def isZero : Boolean = true
  def predecessor : Nat = throw new UnsupportedOperationException("Not a natural number")
  //def successor : Nat = new Succ(this)
  def +(that : Nat) : Nat = that
  def -(that : Nat) : Nat = if(that.isZero) Zero else throw new UnsupportedOperationException("Not a natural number")
}

class Succ(n: Nat) extends Nat{
	def isZero : Boolean = false
	def predecessor : Nat = n
	//def successor : Nat = new Succ(this)
	def +(that : Nat) : Nat = new Succ(n + that)
	def -(that : Nat) : Nat = if(that.isZero) this else n - that.predecessor
}

object Main extends App{
  val a = Zero
  val b = new Succ(Zero)
  println(a + b)
}