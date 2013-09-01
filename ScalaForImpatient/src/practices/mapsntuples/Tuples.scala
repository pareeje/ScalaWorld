package practices.mapsntuples

import scala.Array.canBuildFrom

object Tuples {
	def main(args : Array[String]){
	  //Declare a Tuple
	  val tuple = ("Paromita",29,'F')
	  //Print a tuple
	  printTuple(tuple)
	  //Using pattern matching to acces Tuple elements
	  val (first,second,third) = tuple
	  println(second)
	  //Tuples are useful to make a function return more than 1 value
	  val (one,two) = "New York".partition(_.isUpper) // Yields the pair ("NY", "ew ork")
	  println("Printing Partition 1")
	  println(one)
	  //Bundle values using tuples and method : zip
	  val scores = Array(10,20,40,30)
	  val students = Array("Aa","Bb","Cc","Dd")
	  val studScoreDet = scores.zip(students) //Yield Array()
	  //Process the bundled values
	  printStudentScores(studScoreDet)
	}
	
	def printTuple(tuple : Tuple3[java.lang.String,Int,Char]){
	  //Printing a tuple
	  println(tuple._1,tuple._2,tuple._3)
	}
	
	def printStudentScores(details : Array[(Int,java.lang.String)]){
	  for((s,n) <- details) println(n,s)
	}
}