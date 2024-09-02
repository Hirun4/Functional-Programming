object BankOperationsExample {
  class Account(val id: String, var balance: Double) {
    def deposit(amount: Double): Unit = {
      balance += amount
    }

    def withdraw(amount: Double): Unit = {
      if (amount <= balance) balance -= amount
      else println("Insufficient funds")
    }

    override def toString: String = s"Account($id, Balance: $$balance)"
  }

  class Bank(val accounts: List[Account]) {
    
    // 4.1 List of Accounts with negative balances
    def accountsWithNegativeBalances: List[Account] = accounts.filter(_.balance < 0)
    
    // 4.2 Calculate the sum of all account balances
    def totalBalance: Double = accounts.map(_.balance).sum
    
    // 4.3 Calculate the final balances after applying interest
    def applyInterest(): Unit = {
      accounts.foreach { account =>
        if (account.balance > 0) {
          account.deposit(account.balance * 0.05)
        } else {
          account.withdraw(account.balance.abs * 0.15)
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val acc1 = new Account("1", 1000)
    val acc2 = new Account("2", -200)
    val acc3 = new Account("3", 500)
    val bank = new Bank(List(acc1, acc2, acc3))

    println(s"Accounts with negative balances: ${bank.accountsWithNegativeBalances}")
    println(s"Total balance: ${bank.totalBalance}")
    bank.applyInterest()
    println(s"Balances after interest: ${bank.accounts.map(_.toString).mkString(", ")}")
  }
}
