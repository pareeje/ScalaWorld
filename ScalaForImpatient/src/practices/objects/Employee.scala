package practices.objects

class Employee(var id:Int, var balance : Double) {
	override def toString = {"Acc No: " + id + " has balance : " + balance}
}