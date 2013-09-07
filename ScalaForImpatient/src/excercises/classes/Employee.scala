package excercises.classes

class Employee(var name: String = "", var salary: Double = 0.0) {
}

object EmployeeComp{
  def main(args:Array[String]){
    val e = new Employee()
    println("New Employee - " + "Name : " + e.name + " Salary : " + e.salary)
    e.name = "Hadoop"
    e.salary = 5000.0
    println("Updated Employee - " + "Name : " + e.name + " Salary : " + e.salary)
  }
}