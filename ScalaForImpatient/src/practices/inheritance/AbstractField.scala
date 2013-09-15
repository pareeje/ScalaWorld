package practices.inheritance

abstract class Worker(name : String) {
  var empId : String //abstract field
}

class DailyWorker(name : String) extends Worker(name){
  override var empId = name+"D0"
  def details { println("Emp Name : " + name + " -> Emp Id : " + empId) }
}

class WeeklyWorker(name : String) extends Worker(name){
  override var empId = name + "W0"
  def details { println("Emp Name : " + name + " -> Emp Id : " + empId) }
}

object WorkerComp extends App{
  //val w = new Worker("SimpleWorker") //cannot be instantiated
  val dw = new DailyWorker("DailyWorker")
  dw.details
  val ww = new WeeklyWorker("WeeklyWorker")
  ww.details
}