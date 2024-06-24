def takeHomeSalary(normalHours: Int, otHours: Int): Double = {
  val normalRate = 250
  val otRate = 85
  val grossSalary = (normalHours * normalRate) + (otHours * otRate)
  val tax = 0.12 * grossSalary
  val netSalary = grossSalary - tax
  netSalary
}


