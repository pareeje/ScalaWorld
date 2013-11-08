package expressions

trait Expr {
	def eval : Int = {
	  this match {
	    case Number(n) => n
	    case Sum(e1,e2) => e1.eval + e2.eval
	  }
	}
	//def show( exp : Expr) : String
}

case class Number(n:Int) extends Expr
case class Sum( e1: Number, e2: Number) extends Expr

object testExpr {
  def show(exp : Expr) : String = {
    exp match {
      case Number(x) => x.toString()
      case Sum(e1:Number, e2:Number) => show(e1) + "+" + show(e2)
    }
  }
}

object test extends App{
  println(testExpr.show(Sum(Number(1),Number(2))))
  println(Sum(Number(1),Number(3)).eval)
}