package excercises.classes

class PersonDetails(fullName : String) {
  var firstName = fullName.split(' ')(0)
  var lastName = fullName.split(' ')(1)
  def fName = firstName.toString()
  def lName = lastName.toString()
  
}

object PersonDetailsComp{
  def main( args : Array[String]){
    val p = new PersonDetails("Paromita Banerjee")
    println("First name : " + p.fName + " and Last name: " + p.lastName)
  }
}