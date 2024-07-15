import scala.io.StdIn.readLine

object InventoryManagementSystem extends App {
  
  // Function to get the list of products
  def getProductList(): List[String] = {
    def loop(acc: List[String]): List[String] = {
      val input = readLine("Enter product name (or type 'done' to finish): ")
      if (input == "done") acc.reverse
      else loop(input :: acc)
    }
    loop(Nil)
  }
  
  // Function to print the list of products
  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }
  
  // Function to get the total number of products
  def getTotalProducts(products: List[String]): Int = {
    products.length
  }
  
  // Main logic
  val products = getProductList()
  println("\nProduct List:")
  printProductList(products)
  println(s"\nTotal Products: ${getTotalProducts(products)}")
}
