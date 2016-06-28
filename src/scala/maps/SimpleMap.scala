package scala.maps

import scala.collection.mutable

/**
 * Created by evgen on 10.04.16.
 */
object SimpleMap {

  def main(args: Array[String]) {
    val rates:Map[String, Int]= Map("Alice" -> 10, "Bob" -> 3)
    val map = scala.collection.mutable.Map("Alice" -> 20)
    printCollection(rates)
    printCollection(map)
    val m = new scala.collection.mutable.HashMap[String, Int]
    val pair:(String, Int) = "One" -> 1
    println(pair.getClass)
    println(("One", 1, 3).getClass)
    /**
     *
     */
    val rate:Int = rates("Alice")
    println(rate)
    val aliceScore:Int = if(rates.contains("Alice")) rates("Alice") else 0
    val bobScore:Int = rates.getOrElse("Bob", 0)
    /**
     *
     */
    val value:Option[Int] = map.get("Bob")
    /**
     *
     */
    val scores:mutable.HashMap[String, Int] = new scala.collection.mutable.HashMap
    scores += ("Bob" -> 10, "Alice" -> 20)
    println(scores)
    /**
     *
     */
    val immutableScores:Map[String, String] = Map("Hello" -> " world")
    println(immutableScores)
    val newMap:Map[String, String] = immutableScores.+("foo" -> "bar").+("One" -> "1")
    println(newMap)
    println("Get by key 'One': " + newMap("One"))
    println("Delete key 'One'")
    val withoutOne : Map[String, String] = newMap.-("One")
    println(withoutOne)
    println("Delete key 'foo'")
    val withoutFoo: Map[String, String] = withoutOne - "foo"
    println(withoutFoo)
  }

  def printCollection[T](traversable: Traversable[T]):Unit={
    for(el <- traversable) println(el)
  }

}
