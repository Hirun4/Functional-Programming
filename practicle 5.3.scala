object Fibonacci extends App {

  // Recursive function to generate the first n Fibonacci numbers
  def fibonacci(n: Int): List[Int] = {
    def fibHelper(x: Int, prev: Int, next: Int, acc: List[Int]): List[Int] = {
      if (x <= 0) acc
      else fibHelper(x - 1, next, prev + next, acc :+ prev)
    }
    fibHelper(n, 0, 1, List())
  }

  // Function to print the first n Fibonacci numbers
  def printFibonacci(n: Int): Unit = {
    val fibs = fibonacci(n)
    fibs.foreach(println)
  }

  // Main logic to print the first n Fibonacci numbers
  val n = 10 // You can change this value to print more or fewer Fibonacci numbers
  println(s"The first $n Fibonacci numbers are:")
  printFibonacci(n)
}
