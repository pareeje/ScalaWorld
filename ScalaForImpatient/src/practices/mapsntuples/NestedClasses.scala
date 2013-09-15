package practices.mapsntuples

class NestedClass {
  
  class InnerClass(var displayName : String){
    def displayMyName = println(displayName)
  }
}

object NestedClassCompObject{
  def main(args : Array[String]){
    val nClass = new NestedClass()
    val inner = new nClass.InnerClass("InnerClass")
    inner.displayMyName
  }
}