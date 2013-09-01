package exercises.mapsntuples

object MaxMin {
  
  def main(args : Array[String]){
    val elem = Array(10,30,2,4,5,6,9,46,73,1,100)
    val maxMin = findMaxMin(elem)
    print("Max :" + maxMin._2 + "//Min : " + maxMin._1)
  }

  def findMaxMin(values : Array[Int]) = {
    (values.min,values.max)
  }
}