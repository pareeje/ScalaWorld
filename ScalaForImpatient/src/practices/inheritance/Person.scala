package practices.inheritance

class Person(var name : String) {
  def display = println("Name : " + name)
}

class Employee(name : String, var employeeId: Int) extends Person(name) {  
  override def display = println("Name : " + name + "->Emp id : " + employeeId)
}

class Manager(name : String, empId : Int, var managerId: Int = 0) extends Employee(name,empId) {
  override def display = println("Name : " + name + "->Emp id : " + employeeId + "-> Manager Id : " + managerId)
}

object PersonComp extends App{
  var p = new Person("First Employee")
  println("P is Instance of Person ?" + p.isInstanceOf[Person])
  p = new Employee("First Employee",100)
  println("P is Instance of Person ?" + p.isInstanceOf[Employee])
  val m = new Manager("First Employee",100,1)
  println("M is Instance of Person ?" + p.isInstanceOf[Manager])
}