object Practical2Part2 {
  def main(args: Array[String]): Unit = {

    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3f
    val g = 0.0f


    // a) println( - -b * a + c * d - -)
    println(s"a) ${(-(-b)) * a + c * d}")

    // b) println(a++)
    println(s"b) $a")
    a += 1

    // c) println (–2 * ( g – k ) +c)
    println(s"c) ${-2 * (g - k) + c}")

    // d) println (c=c++)
    c += 1
    println(s"d) $c")

    // e) println (c=++c*a++)
    c = (c + 1) * a
    println(s"e) $c")
    a += 1
  }
}
