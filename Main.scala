object Pr2Part1 {
  def main(args: Array[String]): Unit = {

    var i, j, k = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'


    // a) k + 12 * m
    val resultA = k + 12 * m
    println(s"a) k + 12 * m = $resultA")

    // b) m / j
    val resultB = m / j
    println(s"b) m / j = $resultB")

    // c) n % j
    val resultC = n % j
    println(s"c) n % j = $resultC")

    // d) m / j * j
    val resultD = m / j * j
    println(s"d) m / j * j = $resultD")

    // e) f + 10 * 5 + g
    val resultE = f + 10 * 5 + g
    println(s"e) f + 10 * 5 + g = $resultE")

    // f) ++i * n
    i += 1
    val resultF = i * n
    println(s"f) ++i * n = $resultF")


  }
}


/*
Comparison of Java and Scala

Syntax: Scala is more concise than Java. It allows for more expressive code.
  Type Inference: Scala can infer types, reducing boilerplate code. Java requires explicit type declarations.
Functional Programming: Scala integrates functional programming paradigms more naturally than Java.
Immutability: Scala encourages immutability and immutable data structures.
  Concurrency: Scala has better concurrency support with Akka and Futures.
Interoperability: Both languages run on the JVM and can interoperate, but Scala offers more syntactic sugar for functional constructs.


 */