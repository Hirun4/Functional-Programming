object InventoryManagement {
  var itemNames = Array("Apples", "bananas", "Oranges")
  var itemQuantities = Array(10, 20, 30)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    if (itemNames.contains(itemName)) {
      val index = itemNames.indexOf(itemName)
      itemQuantities(index) += quantity
      println(s"Restocked $quantity $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item '$itemName' not found in inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    if (itemNames.contains(itemName)) {
      val index = itemNames.indexOf(itemName)
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity $itemName. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in stock to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item '$itemName' not found in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
   //restockItem("bananas", 10)
    sellItem("Mangos", 5)
    //sellItem("Oranges", 5)
    displayInventory()
  }
}
