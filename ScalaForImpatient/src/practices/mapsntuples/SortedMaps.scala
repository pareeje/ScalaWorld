package practices.mapsntuples

import scala.collection.JavaConversions._
//import maps.MapImpl

object SortedMaps {
	def main(args : Array[String]){
	  val scores = scala.collection.immutable.SortedMap("Alice" -> 10,
			  "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
	  mapsnTuples.printMap("Sorted map", scores)
	  val orderedAsInserted = scala.collection.mutable.LinkedHashMap("Jan"->31,"Feb"->28,"Mar"->31
	      ,"Apr"->30)
	  mapsnTuples.printMap("Using a LinkedHashMap for ordered as inserted", orderedAsInserted)
	  
	  //val mapFromJava =  scala.collection.JavaConversions.mapAsScalaMap(MapImpl.getMap())
	  //mapsnTuples.printMap("Converted Java map to Scala map", mapFromJava)
	/*  val mapFromJava : scala.collection.mutable.Map[String,java.lang.Integer] = 
	    scala.collection.JavaConversions.mapAsScalaMap(MapImpl.getMap())
	  println("Converted Java map to Scala Map") 
	  println(mapFromJava.size)
	  for((k,v) <- mapFromJava)
	      println(k,v)*/
	}
}