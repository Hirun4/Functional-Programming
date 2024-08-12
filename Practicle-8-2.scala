object PatternMatchingApp {
  def categorizeNumber(number: Int): String = {
    val isMultipleOfThree = (n: Int) => n % 3 == 0
    val isMultipleOfFive = (n: Int) => n % 5 == 0

    (isMultipleOfThree(number), isMultipleOfFive(number)) match {
      case (true, true) => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val input = args(0).toInt
      println(categorizeNumber(input))
    } else {
      println("Please provide an integer input.")
    }
  }
}
