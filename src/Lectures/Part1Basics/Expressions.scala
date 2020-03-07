package Lectures.Part1Basics

object Expressions extends App {
  // EXPRESSIONS VS DECLARATIONS
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //IF EXPRESSION
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  var aVariable: Int = 1
  val aUnitType: Unit = (aVariable = 3) // Unit===Void
  println(aUnitType)

  // side effects: println(), whiles, reassigns

  //Code Blocks
  val aCodeBlock = {
    val y=2
    val z=y-1

    if (z>2) "Maior que 2" else "Menor que 2"
  }
  println(aCodeBlock)
  // println(z) don`t work, z is outside scope
  val b = 2<3
  val a ={
    if(b) 10 else 20
    30
  }
  println(a)
}



