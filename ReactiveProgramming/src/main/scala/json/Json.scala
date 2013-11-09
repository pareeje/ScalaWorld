package json

trait JSon

case class JNumber(n: Double) extends JSon
case class JStr(str: String) extends JSon
case class JBoolean(bool: Boolean) extends JSon
case class JSeq(elems: List[JSon]) extends JSon
case class JObj(bindings: Map[String, JSon]) extends JSon
case object JNull extends JSon

object testJSon extends App {

  val jsonObj =
    JObj(Map(
      "FirstName" -> JStr("Paromita"),
      "LastName" -> JStr("Banerjee"),
      "Address" -> JObj(Map(
        "Street" -> JStr("C.R. Das Road"),
        "State" -> JStr("West Bengal"),
        "PostalCode" -> JNumber(700078))),
      "PhoneNumbers" -> JSeq(List(
        JObj(Map("Type" -> JStr("Home"), "Number" -> JStr("000-0000-000"))),
        JObj(Map("Type" -> JStr("Off"), "Number" -> JStr("111-1111-111")))))))
        
   def show( obj : JSon) : String = {
    obj match {
      case JNumber(n) => n.toString
      case JBoolean(b) => b.toString
      case JStr(s) => s
      case JNull => "null"
      case JSeq(seq) => "[" + (seq map show mkString ",") + "]"
      case JObj(bindings) => val str = bindings map {
        case(key,value) => "\"" + key + "\":" + show(value)
      }
      "{" + str.mkString(",") + "}"
    }
  }
  
  println(show(jsonObj))
}