package practices.mapsntuples

class MyFirstClass(var name: String) {
  def display = println(name)
}

object MyFirstClassCompObject{
  def main(args : Array[String]){
    val mfc = new MyFirstClass("Paromita")
    mfc.display    
  }
}