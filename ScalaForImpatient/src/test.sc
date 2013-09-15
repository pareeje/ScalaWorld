object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  class Person {
    var name: String = ""
    def display = println("Name : " + name)
  }
  
  class Employee extends Person{
  	override def display = println("Nothing")
  }

}