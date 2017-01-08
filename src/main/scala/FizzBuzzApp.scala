import scala.util.Try

object FizzBuzzApp extends App {
	if (args.forall(x => Try(x.toInt).isSuccess))
  	println(FizzBuzz.adapt(args.map(_.toInt).toList))
	else {
		println("All arguments should be integers")
		println(s"You provided ${args.mkString(" ")}")
	}
}
