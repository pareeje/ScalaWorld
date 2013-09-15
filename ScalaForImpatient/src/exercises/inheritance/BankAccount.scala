package exercises.inheritance

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def currBalance  = balance
  override def toString = "Balance : " + balance
}

class CheckingAccount(initBal : Double) extends BankAccount(initBal){
   override def deposit(amount: Double) = { super.deposit(amount-1.0) } 
   override def withdraw(amount: Double) = { super.withdraw(amount+1.0) }
}

object BankAccount extends App{
  val bAcc = new CheckingAccount(1000)
  println(bAcc)
  bAcc.deposit(500)
  println(bAcc)
  bAcc.withdraw(200)
  println(bAcc)
}