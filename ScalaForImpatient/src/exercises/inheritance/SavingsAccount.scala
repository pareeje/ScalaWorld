package exercises.inheritance

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var transactionCount: Int = 0
  def earnMonthlyInterest() {
    super.deposit(currBalance*0.1)
  }
  override def deposit(amount: Double) = {
    transactionCount+=1
    super.deposit(amount - (if (transactionCount <= 3) 0.0 else 1.0))
  }
  override def withdraw(amount: Double) = {
    transactionCount+=1
    super.withdraw(amount + (if (transactionCount <= 3) 0.0 else 1.0))
  }
}

object SavingsAccount extends App{
  val c = new SavingsAccount(1000.0)
  c.deposit(100)
  println(c)
  c.withdraw(200)
  println(c)
  c.earnMonthlyInterest()
  println(c)
  c.deposit(100)
  println(c)
  c.withdraw(200)
  println(c)
  c.withdraw(200)
  println(c)
  c.withdraw(200)
  println(c)
  c.earnMonthlyInterest()
  c.deposit(100)
  println(c)
}