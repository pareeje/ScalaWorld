package exercises.mapsntuples

object WordCount {
	def main(args : Array[String]){
	  val in = new java.util.Scanner(new java.io.File("E:\\Scala Workspace\\MapsnTuplesPractise\\src\\excersice\\Test.txt"))
	  val wordCount = new scala.collection.mutable.HashMap[String,Int]
	  while(in.hasNext()){
	    val word = in.next()
	    wordCount(word) = wordCount.getOrElse(word,0) + 1 //equivalent to if map.contains(a) return a else return 0
	  }
	  
	  println("Printing word Count")
	  for((w,c) <- wordCount) print(w,c + " ")
	  println("Same achieved using immutable map")
	  //sameOpWithImmutableMap()
	  wordCountWithSortedMap()
	}
	
	def sameOpWithImmutableMap(){
	  val in = new java.util.Scanner(new java.io.File("E:\\Scala Workspace\\MapsnTuplesPractise\\src\\excersice\\Test.txt"))
	  
	  var immutablWordCount = new scala.collection.immutable.HashMap[String,Int]
	  while(in.hasNext()){
	    val word = in.next()
	    immutablWordCount = immutablWordCount + (word -> (immutablWordCount.getOrElse(word,0) + 1))
	  }
	  println("Printing word Count")
	  for((w,c) <- immutablWordCount) println(w,c)
	}
	
	def wordCountWithSortedMap(){
	  val in = new java.util.Scanner(new java.io.File("E:\\Scala Workspace\\MapsnTuplesPractise\\src\\excersice\\Test.txt"))
	  
	  var immutablWordCount = scala.collection.immutable.SortedMap[String,Int]()
	  while(in.hasNext()){
	    val word = in.next()
	    immutablWordCount = immutablWordCount + (word -> (immutablWordCount.getOrElse(word,0) + 1))
	  }
	  println("Printing word Count with sorted map")
	  for((w,c) <- immutablWordCount) println(w,c)
	  }
	}