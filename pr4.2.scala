object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer input.")
    } else {
      val input = args(0).toInt

      input match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case x if x % 2 != 0 => println("Odd number is given")
      }
    }
  }
}

