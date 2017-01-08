object FizzBuzz {
  def adapt(numberRange: List[Int]): String = {
    adaptWithAccumulator(adapter = simpleFizzBuzzAdapter, numberRange = numberRange).mkString(" ")
  }

  def adaptWithAccumulator(adapter: (Int) => (String), numberRange: List[Int], acc: List[String] = Nil): List[String] = {
    numberRange match {
      case (h::t) => adaptWithAccumulator(adapter, t, acc :+ adapter(h))
      case Nil => acc
    }
  }

  def simpleFizzBuzzAdapter(number: Int): String = {
    number match {
      case fizzbuzz if (fizzbuzz % 15 == 0) => "fizzbuzz"
      case fizz if (fizz % 3 == 0) => "fizz"
      case buzz if (buzz % 5 == 0) => "buzz"
      case _ => number.toString
    }
  }
}
