package exercises.mapsntuples

object WeekDays {
  
  def main(args : Array[String]){
    val weekDays = scala.collection.mutable.LinkedHashMap(
        "Monday" -> java.util.Calendar.MONDAY,
        "Tuesday" -> java.util.Calendar.TUESDAY,
        "Wednesday" -> java.util.Calendar.WEDNESDAY)
    
    println("Print days in week")
    for((s,u) <- weekDays) printf("%s=%d\n", s, u)
    
  }

}