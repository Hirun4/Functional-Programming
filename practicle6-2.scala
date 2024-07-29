
import scala.io.StdIn

object StudentRecords {
  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student's name:")
    val name = StdIn.readLine().trim
    println("Enter student's marks:")
    val marks = StdIn.readInt()
    println("Enter total possible marks:")
    val totalMarks = StdIn.readInt()

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(studentRecord: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = studentRecord
    println(s"Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) (false, Some("Name cannot be empty"))
    else if (marks < 0 || marks > totalMarks) (false, Some("Marks must be positive and not exceed total marks"))
    else (true, None)
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentInfo: (String, Int, Int, Double, Char) = null

    while (!validInput) {
      val info = getStudentInfo()
      val (name, marks, totalMarks, _, _) = info
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

      if (isValid) {
        validInput = true
        studentInfo = info
      } else {
        println(errorMessage.getOrElse("Invalid input, please try again."))
      }
    }

    studentInfo
  }

  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry()
    printStudentRecord(studentRecord)
  }
}
