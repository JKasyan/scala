package scala.arrays

import scala.collection.TraversableOnce

/**
 * Created 09.04.16.
 */
object TransformationArrays {

  def main(arr:Array[String]) : Unit = {
    val p:Int = 5
    val g:Int = p.+(5)
    printf("Hello %s\n", "world")
    val a:Array[Int] = new Array[Int](10)
    for (i <- 0 until a.length) a(i) = i
    val result = for(el <- a if el % 2 != 0) yield el * el
    printArray(result)
    /**
     *
     */
    val c = a.filter(_ % 2 == 0).map(_ * 2)
    printArray(c)
    /**
     *
     */
    val f:Array[Int] = Array(1, -2 , 3, -5 , 20)
    var first:Boolean = true
    val h = for(i <- 0 until f.length if first || f(i) >= 0) yield {if(f(i) < 0 ) first = false; i}
    println("Array: ")
    for(el <- h) println(el + " ")
    /**
     *
     */
    printCollection(f)
  }

  def printArray[T](array: Array[T]) : Unit = {
    for(el <- array) println(el)
  }

  def printCollection[T](collection:TraversableOnce[T]):Unit={
    for(el <- collection) println(el)
  }
}
