
def getAllProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
      inventory.values.map(_._1).toList
    }


def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
      inventory.values.map { case (_, quantity, price) => quantity * price }.sum
    }


def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
      inventory.isEmpty
    }


def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
  
  var mergedInventory = Map[Int, (String, Int, Double)]()

  
  for ((id, (name, quantity, price)) <- inventory1) {
    mergedInventory += (id -> (name, quantity, price))
  }

  
  for ((id, (name2, quantity2, price2)) <- inventory2) {
    if (mergedInventory.contains(id)) {
      
      val (name1, quantity1, price1) = mergedInventory(id)
      val updatedQuantity = quantity1 + quantity2
      val updatedPrice = price1 max price2
      mergedInventory += (id -> (name1, updatedQuantity, updatedPrice))
    } else {
      
      mergedInventory += (id -> (name2, quantity2, price2))
    }
  }

  mergedInventory
}

def checkProductExistence(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
 
  inventory.get(productId) match {
    
    case Some((name, quantity, price)) =>
      println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
    
    case None =>
      println(s"Product with ID $productId does not exist.")
  }
}


def main(args: Array[String]): Unit = {
    val inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 10, 50.0),
      102 -> ("ProductB", 5, 30.0),
      103 -> ("ProductC", 20, 15.0)
    )
    
    val inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 10, 35.0),
      104 -> ("ProductD", 15, 25.0)
    )

   
    println(checkProductExistence(inventory1,102)) 
    
}