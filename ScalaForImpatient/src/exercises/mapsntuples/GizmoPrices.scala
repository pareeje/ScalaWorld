package exercises.mapsntuples

import exercises._
import scala.Array.canBuildFrom

object GizmoPrices {
	def main(args : Array[String]){
	  val gizmoNames = Array("Mobile","Ipad","Macbook","MacbbokAir")
	  val marketPrices = Array(100,95,1000,1100)
	  val initialPriceDetials = gizmoNames.zip(marketPrices)
	  //Printing initial prices
	  for((n,p) <- initialPriceDetials) println(n,p)
	  val newPrices = for((n,p) <- initialPriceDetials ) yield (n, p * 0.9)
	  //Printing Discounted prices
	  println("Printing Discounted prices")
	  for((n,p) <- newPrices) println(n,p)
	}
}