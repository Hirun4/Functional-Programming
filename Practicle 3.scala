object ScalaFunctions {

  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }


  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }


  def arithmeticMean(num1: Int, num2: Int): Double = {
    BigDecimal((num1 + num2) / 2.0).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }


  def sumOfEvens(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }


  def main(args: Array[String]): Unit = {

    val str = "hello"
    println(s"Reversed '$str' is '${reverseString(str)}'")


    val stringList = List("apple", "banana", "cherry", "date")
    println(s"Strings longer than 5 characters: ${filterLongStrings(stringList)}")


    val num1 = 4
    val num2 = 10
    println(s"The arithmetic mean of $num1 and $num2 is ${arithmeticMean(num1, num2)}")

    
    val intList = List(1, 2, 3, 4, 5, 6)
    println(s"The sum of even numbers in $intList is ${sumOfEvens(intList)}")
  }
}
