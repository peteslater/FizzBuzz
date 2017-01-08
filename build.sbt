name := "Fizz Buzz"
version := "1.0"
scalaVersion := "2.12.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val scalaticVersion   = "3.0.0"
  val scalatestVersion  = "3.0.0"

  Seq(
    "org.scalactic" %% "scalactic" % scalaticVersion,
    "org.scalatest" %% "scalatest" % scalatestVersion % "test"
  )
}
