object AccountTransferExample {
  class Account(val id: String, var balance: Double) {
    def deposit(amount: Double): Unit = {
      balance += amount
    }

    def withdraw(amount: Double): Unit = {
      if (amount <= balance) balance -= amount
      else println("Insufficient funds")
    }

    def transfer(amount: Double, to: Account): Unit = {
      if (amount <= balance) {
        this.withdraw(amount)
        to.deposit(amount)
      } else {
        println("Insufficient funds for transfer")
      }
    }

    override def toString: String = s"Account($id, Balance: $$balance)"
  }

  def main(args: Array[String]): Unit = {
    val acc1 = new Account("1", 1000)
    val acc2 = new Account("2", 500)
    acc1.transfer(200, acc2)
    println(acc1)  
    println(acc2)  
  }
}
