object NumberClassifier {
  def main(args: Array[String]): Unit = {
    def classifyNumber(num: Int): String = num match {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    
    println(classifyNumber(-5)) 
    println(classifyNumber(0))  
    println(classifyNumber(4))  
    println(classifyNumber(7))  
  }
}
