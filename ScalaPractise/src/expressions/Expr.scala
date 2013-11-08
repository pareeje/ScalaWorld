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
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1 : Expr, e2 : Expr) extends Expr
case class Var(x:Char) extends Expr

object testExpr {
  def show(exp : Expr) : String = {
    exp match {
      case Number(x) => x.toString()
      case Sum(e1, e2) => show(e1) + "+" + show(e2)
      case Prod(e1,e2) => 
        val st1 = e1 match {
          case Sum(a,b) => "(" + show(Sum(a,b)) + ")"
          case _ => show(e1)
        }
        val st2 = e2 match {
          case Sum(a,b) => "(" + show(Sum(a,b)) + ")"
          case _ => show(e2)
        }
        st1 + "*" + st2
      case Var(x) => x.toString
    }
  }
}

object test extends App{
  
  println(testExpr.show(Sum(Number(1),Number(2))))
  println(Sum(Number(1),Number(3)).eval)
  println(testExpr.show(Sum(Number(2),Prod(Number(10),Var('x')))))
  
  println(testExpr.show(Sum(Prod(Number(2),Var('x')),Var('y'))))
  println(testExpr.show(Prod(Sum(Number(2),Var('x')),Var('y'))))
  println(testExpr.show(Prod(Sum(Number(2),Var('x')),Sum(Number(3),Var('y')))))
}