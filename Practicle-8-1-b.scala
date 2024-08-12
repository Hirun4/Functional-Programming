object CaesarDecryption {
  def decrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val offset = if (char.isUpper) 'A' else 'a'
        ((char - offset + (26 - shift)) % 26 + offset).toChar
      } else {
        char
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val encryptedText = "Khoor, Zruog!" 
    val shift = 3
    val decryptedText = decrypt(encryptedText, shift)
    println(s"Decrypted Text: $decryptedText")
  }
}
