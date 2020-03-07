package Lectures.Part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  def aParameterlessFunction(): Int = 42
    println(aParameterlessFunction())
    println(aParameterlessFunction)

  def aRepreatFunc(aString: String, n: Int): String = {
    if (n ==1) aString
    else aString + aRepreatFunc(aString, n-1)
  }

  println(aRepreatFunc("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int,b: Int):Int = a+b
    aSmallerFunction(n,n-1)
  }

  //Exercises
  //1
  def greetingFunction(name: String, age: Int): Unit = {
    println("My name is " + name + " and I am " + age + " years old")
  }
  greetingFunction("Bruno", 30)

  //2 - Factorial function
  def factorialFunction(n: Int): Int = {
    if (n  <= 1) 1 else n * factorialFunction(n-1)
  }
  println(factorialFunction(4)) //24

  //3 Fibonacci function
  def fibFunction(n: Int): Int = {
    if (n <= 2) 1 else
       fibFunction(n-1) + fibFunction(n-2)
  }
  println(fibFunction(6))

  //4 test if a number is a prime number
  def primeNumberTesterFunction(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(primeNumberTesterFunction(4))
  println(primeNumberTesterFunction(5))

}
