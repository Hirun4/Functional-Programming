case class Book(title: String, author: String, isbn: String)

object LibraryManagementSystem extends App {
  
  // Initial set of books
  var library: Set[Book] = Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "0987654321"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455")
  )
  
  // Function to add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
  }
  
  // Function to remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }
  
  // Function to check if a book is already in the library by its ISBN
  def bookExists(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }
  
  // Function to display the current library collection
  def displayLibrary(): Unit = {
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }
  
  // Function to search for a book by its title
  def searchByTitle(title: String): Option[Book] = {
    library.find(_.title.equalsIgnoreCase(title))
  }
  
  // Function to display all books by a specific author
  def booksByAuthor(author: String): Set[Book] = {
    library.filter(_.author.equalsIgnoreCase(author))
  }
  
  // Main logic
  displayLibrary()
  
  val newBook = Book("Brave New World", "Aldous Huxley", "5566778899")
  addBook(newBook)
  println("\nAfter adding a new book:")
  displayLibrary()
  
  removeBook("1234567890")
  println("\nAfter removing a book by ISBN:")
  displayLibrary()
  
  println(s"\nBook exists with ISBN '0987654321': ${bookExists("0987654321")}")
  
  val searchTitle = "1984"
  println(s"\nSearch for book by title '$searchTitle': ${searchByTitle(searchTitle)}")
  
  val searchAuthor = "Harper Lee"
  println(s"\nBooks by author '$searchAuthor':")
  booksByAuthor(searchAuthor).foreach(println)
}
