package exercises.objects

object Question7 extends Enumeration{

  type Question7 = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")

  def isRed(obj: Question7) = {obj == Heart | obj == Diamond}

}

object testQuestion7 extends App{
  println(Question7.isRed(Question7.Club))
  println(Question7.isRed(Question7.Diamond))
}