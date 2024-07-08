object StringFormatter {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String, formatFunction: String => String): String = formatFunction(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    val formattedNames = names.map {
      case "Benny" => formatNames("Benny", toUpper)
      case "Niroshan" => formatNames("Niroshan".substring(0, 2), toUpper) + formatNames("Niroshan".substring(2), toLower)
      case "Saman" => formatNames("Saman", toLower)
      case "Kumara" => formatNames("Kumara".substring(0, 1), toUpper) + formatNames("Kumara".substring(1, 5), toLower) + formatNames("Kumara".substring(5), toUpper)
    }

    formattedNames.foreach(println)
  }
}
