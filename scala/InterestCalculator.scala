object InterestCalculator {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = deposit => deposit match {
      case d if d <= 20000 => d * 0.02
      case d if d <= 200000 => d * 0.04
      case d if d <= 2000000 => d * 0.035
      case d if d > 2000000 => d * 0.065
    }

    println(calculateInterest(15000))   // Output: 300.0
    println(calculateInterest(150000))  // Output: 6000.0
    println(calculateInterest(1500000)) // Output: 52500.0
    println(calculateInterest(2500000)) // Output: 162500.0
  }
}
