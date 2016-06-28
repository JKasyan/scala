package scala.collections

import java.util

import scala.collection.JavaConversions._
import scala.collection.mutable.{Seq => mSeq}
import scala.collection.mutable.{Map => MutableMap}
import scala.collection.mutable.{Set => mSet}


/**
 * Created on 16.05.16.
 * @author evgen
 */
object JavaInteraction extends App {

  val props:MutableMap[String, String] = System.getProperties
  val list:mSeq[Int] = new java.util.ArrayList[Int]()
  val set:mSet[Person] = new util.HashSet[Person]()
  /**
   * Streams
   */
  val coll:Range = 0 to 1000000
  val sum = coll.par.count(_ % 3 == 0)
  println(sum)
}
