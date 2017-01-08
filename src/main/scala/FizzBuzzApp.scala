object FizzBuzzApp extends App {
  println(FizzBuzz.adapt(args.map(_.toInt).toList))
}
