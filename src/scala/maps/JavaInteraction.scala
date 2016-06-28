package scala.maps

import java.util

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.Map

/**
 * Created on 12.04.16.
 * @author evgen
 */
object JavaInteraction {

  def main(args: Array[String]): Unit = {
    val scores:Map[String , Int] = new util.HashMap[String, Int]()
    scores.put("Alice", 10)
    val newMap = scores.+("Bob" -> 5)
    println(newMap)
    for((k, v) <- scores) println(k + " - " + v)
  }
}
