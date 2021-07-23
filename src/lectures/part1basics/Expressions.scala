package lectures.part1basics

/**
  * Created by Daniel on 07-May-18.
  */
object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / 
  // bitwise operator 
  // & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=
  // ! -> Bang

  println(!(1 == x))
  // ! -> unary
  // && || -> binary

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) something (imperative style of programming)
  // vs 
  // Expressions get (VALUE) (declarative (functional) style of programming)
 
  // using `var` is called side effects. 

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.
  // Loops are discouraged to use in scala
  // looping is very specific to imperative programming 

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning
  // reassigning a variable is side effect. side effect in scala are actually expressions returning a Unit.

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world")?
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)


}
