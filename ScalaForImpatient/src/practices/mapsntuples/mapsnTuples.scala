package practices.mapsntuples

object mapsnTuples {
	def main(args : Array[String]){
	  
	  //Creating an immutable map
	  val scores = Map("Paro" -> 10, "Bunty" -> 10, "Sudipta"->5, "Paromita"->6);
	  printMap("Creating an immutable map", scores)
	  //Creating a mutable map
	  val mutableScores = scala.collection.mutable.Map("abc"->1,"def"->2,"hij"->3);
	  printMap("Creating a mutable map", mutableScores)
	  //Updating a mutable map
	  mutableScores("abc") = 5
	  mutableScores += ("klm"->0,"mno"->4);
	  printMap("Updating a mutable map", mutableScores)
	  //To add / update values in a immutable map, actually creates a new map
	  val newScores = scores + ("Paro"->9,"Fred"->8)
	  printMap("To add / update values in a immutable map, actually creates a new map", newScores)
	  //If we create an immutable map with var, we can have the new map in the same 
	  var ages = Map("Paro"->29,"Bunty"->29)
	  ages = ages + ("XYZ"->50)
	  printMap("If we create an immutable map with var, we can have the new map in the same ", ages)
	  
	}
	
	def printMap(msg : String, values : Map[String,Int]){
	  println(msg)
	  for((k,v) <- values)
	    println(k,v)
	}
		
	def printMap(msg : String, values : scala.collection.mutable.Map[String,Int]){
	  println(msg)
	  for((k,v) <- values)
	    println(k,v)
	}
}