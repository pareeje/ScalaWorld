package excercises.classes

class BankAccount(private var balance : Double = 0) {
	def deposit(amt : Double) = {
	  balance += amt
	}
	
	def withdraw(amt : Double) = {
	  if(balance > amt) balance -= amt
	  else println("You do not have enough to withdraw, check ur balance")
	}
	
	def checkBalance = println("Your current balance : " + balance)
}

object BankAccountBalance{
  def main(args : Array[String]){
    val bacc = new BankAccount(1000)
    bacc.deposit(10)
    bacc.withdraw(900)
    bacc.checkBalance
    bacc.withdraw(2000)
  }
}