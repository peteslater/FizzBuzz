import org.scalatest.FlatSpec

class FizzBuzzSpec extends FlatSpec {
  "FizzBuzz" should "adapt a range of integers to a string with correct replacements" in {
    assert(FizzBuzz.adapt((1 to 20).toList) === "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz")
  }

  it should "correctly convert 3 to fizz" in {
    assert(FizzBuzz.simpleFizzBuzzAdapter(3) === "fizz")
  }

  it should "correctly convert 5 to buzz" in {
    assert(FizzBuzz.simpleFizzBuzzAdapter(5) === "buzz")
  }

  it should "correctly convert 15 to fizzbuzz" in {
    assert(FizzBuzz.simpleFizzBuzzAdapter(15) === "fizzbuzz")
  }
}
