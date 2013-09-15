object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet")}
  class Person {
    var name: String = ""
    def display = println("Name : " + name)
  }
  
  class Employee extends Person{
  	override def display = println("Nothing")
  }

}
