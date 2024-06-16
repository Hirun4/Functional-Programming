object Solutions {

  // 1. Area of a Disk with Radius 5
  def areaOfDisk(radius: Double): Double = {
    math.Pi * radius * radius
  }

  // 2. Convert Temperature from Celsius to Fahrenheit
  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

  // 3. Volume of a Sphere with Radius 5
  def volumeOfSphere(radius: Double): Double = {
    (4.0 / 3.0) * math.Pi * math.pow(radius, 3)
  }

  // 4. Total Wholesale Cost for 60 Copies
  def totalWholesaleCost(copies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val discountedPrice = coverPrice * (1 - discount)
    val shippingCost = if (copies <= 50) {
      3.0
    } else {
      3.0 + (copies - 50) * 0.75
    }
    (discountedPrice * copies) + shippingCost
  }

  // 5. Total Running Time
  def totalRunningTime(): Int = {
    val easyPace = 8 // minutes per km
    val tempoPace = 7 // minutes per km
    val totalEasyDistance = 2 + 2 // total easy pace distance
    val tempoDistance = 3

    val totalMinutes = (totalEasyDistance * easyPace) + (tempoDistance * tempoPace)
    totalMinutes
  }

  def main(args: Array[String]): Unit = {
    // 1. Area of a Disk with Radius 5
    val radiusDisk = 5.0
    println(s"1. Area of the disk with radius $radiusDisk is ${areaOfDisk(radiusDisk)}")

    // 2. Convert Temperature from Celsius to Fahrenheit
    val celsius = 35.0
    println(s"2. $celsius°C is equal to ${celsiusToFahrenheit(celsius)}°F")

    // 3. Volume of a Sphere with Radius 5
    val radiusSphere = 5.0
    println(s"3. Volume of the sphere with radius $radiusSphere is ${volumeOfSphere(radiusSphere)}")

    // 4. Total Wholesale Cost for 60 Copies
    val copies = 60
    println(s"4. Total wholesale cost for $copies copies is Rs. ${totalWholesaleCost(copies)}")

    // 5. Total Running Time
    println(s"5. Total running time is ${totalRunningTime()} minutes")
  }
}
