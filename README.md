Fizz Buzz
===================
Author: Pete Slater
____________________

Explanation
--------------------
This application outputs the following for a given range of numbers:

* the number

* 'fizz' for numbers that are multiples of 3

* 'buzz' for numbers that are multiples of 5

* 'fizzbuzz' for numbers that are multiples of 15

Running the program over a range from 1-20 I should give the following output

>1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz

----------

Instructions
-------------

Execute the test scripts via sbt:
> sbt clean compile test

Execute the test app via sbt:
> sbt "run 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"

The test app contains the side effects of running the code e.g. logging the result to the console.

Execute the test coverage generater via sbt:
> sbt clean coverage test

Build the test coverage report via sbt:
> sbt coverageReport

The generated reports can be viewed via a browser. The files will be generated in:
> target/scala-2.12/scoverage-report
