object CaesarEncryption {
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val offset = if (char.isUpper) 'A' else 'a'
        ((char - offset + shift) % 26 + offset).toChar
      } else {
        char
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val text = "Hello, World!"
    val shift = 3
    val encryptedText = encrypt(text, shift)
    println(s"Encrypted Text: $encryptedText")
  }
}
