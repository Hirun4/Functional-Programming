def profit(price: Int): Int = {
  val baseAttendance = 120
  val attendanceChange = 20
  val attendance = baseAttendance + ((15 - price) / 5) * attendanceChange
  val revenue = attendance * price
  val cost = 500 + (attendance * 3)
  revenue - cost
}

def findOptimalPrice(): Int = {
  (5 to 25 by 5).maxBy(profit)
}

