object StringFormatter {
  def main(args: Array[String]): Unit = {
    def toUpper(str: String): String = str.toUpperCase
    def toLower(str: String): String = str.toLowerCase

    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    
    println(formatNames("Benny")(toUpper))        // Output: BENNY
    println(formatNames("Niroshan")(str => str.substring(0, 2).toUpperCase + str.substring(2))) // Output: NIroshan
    println(formatNames("Saman")(toLower))        // Output: saman
    println(formatNames("Kumara")(str => str.substring(0, 1).toUpperCase + str.substring(1, str.length-1).toLowerCase + str.substring(str.length-1).toUpperCase)) // Output: KumarA
  }
}
