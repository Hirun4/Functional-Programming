object RationalNumberExample {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must be non-zero")
    
    private val gcdVal = gcd(n.abs, d.abs)
    val numer: Int = n / gcdVal
    val denom: Int = d / gcdVal

    def this(n: Int) = this(n, 1) 

    def neg: Rational = new Rational(-this.numer, this.denom)

    override def toString: String = s"$numer/$denom"

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    println(s"Negative of $x is ${x.neg}")
  }
}
