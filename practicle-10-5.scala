object CountLetterOccurrencesExample {
  def countLetterOccurrences(words: List[String]): Int = {
    words.map(_.length).reduce(_ + _)
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalLetterCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalLetterCount")
  }
}
