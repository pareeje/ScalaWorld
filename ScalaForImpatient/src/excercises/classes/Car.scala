package excercises.classes

class Car(val man : String,val mod : String,var modYear : Int = -1, var lic : String = "" ) {
}

object CarComp{
  def main(args:Array[String]){
    val c = new Car("Honda","City")
    println("Car detals: ")
    println("MANUFACTURER : " + c.man)
    println("MODEL : " + c.mod )
    println("MODEL YEAR : " + c.modYear)
    println("LICENCE PLATE : " + c.lic)
    c.lic = "AB10000"
    c.modYear = 1984
    println("Car detals updated: ")
    println("MANUFACTURER : " + c.man)
    println("MODEL : " + c.mod )
    println("MODEL YEAR : " + c.modYear)
    println("LICENCE PLATE : " + c.lic)
  }
}