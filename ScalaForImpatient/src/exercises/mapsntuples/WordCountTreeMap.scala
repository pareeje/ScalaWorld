package exercises.mapsntuples

import java.util.TreeMap
import scala.collection.JavaConversions._

object WordCountTreeMap {
  
  def main(args : Array[String]){
    val count : scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
    val in = new java.util.Scanner(new java.io.File("E:\\Scala Workspace\\MapsnTuplesPractise\\src\\excersice\\Test.txt"))
	while(in.hasNext()){
	  val word = in.next()
	  count(word) = count.getOrElse(word,0) + 1
	}
    println("Using a Treemap : printing the word counts")
    for((w,c) <- count) print(w + "-->", c)
    
  }

}