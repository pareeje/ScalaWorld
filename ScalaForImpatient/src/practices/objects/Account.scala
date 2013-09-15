package practices.objects

class Account(accountNo:Int,initialBalance:Double) {
  
  private val accountId = Account.uniqueAcNumber;
  private var balance = 0.0;
  
  def diposit(deposit:Int) { balance += deposit}
  def withdraw(withdrawal:Int) { balance -= withdrawal}
}

object Account extends App{
  private var accountNo = 0
  private def uniqueAcNumber = {accountNo+=1; accountNo}
  
  val acc = Account(1200.00)
  println("Acc no: " + acc.accountId + " has balance: " + acc.balance)
  
  def apply(initialBalance:Double) = {
    new Account(uniqueAcNumber,initialBalance)
  }
  
  
}