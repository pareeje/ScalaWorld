package exercises.mapsntuples

object CaseConverter {
	def main(args : Array[String]){
	  val conversions = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".zip("abcdefghijklmnopqrstuvwxyz").toMap
	  println(conversions('A'))
	  
	  val encoder = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".zip("1234567890").toMap
	  val encoded = (encoder('D'),encoder('E'),encoder('C'))
	  printf("Printing encoded msg : DEC --> " + encoded )
	}
}