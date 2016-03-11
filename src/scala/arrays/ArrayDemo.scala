package scala.foundations.arrays

import java.util

import scala.collection.mutable.ArrayBuffer

/**
 * Created by evgen on 08.03.16.
 */
object ArrayDemo {

  def main(args: Array[String]): Unit = {
    val a = new Array[Int](10)
    val b = new Array[String](2)
    val c = Array("Hello", "World")
    println(util.Arrays.toString(a))
    val m = ArrayBuffer[Int]()
  }

}
