package scala.collections

import scala.collection.immutable.HashSet
import scala.io.Source
import scala.math._

/**
 * Created on 14.05.16.
 * @author evgen
 */
object Sets extends App {

  testAr(1, 2, 3)
  val arrayList:ArrayList[Double] = new ArrayList
  arrayList += 1
  arrayList += 2
  println(arrayList)
  /**
   *
   */
  val set:Set[Int] = Set(0, 1, 2, 3, 4, 5, 6)
  println(set.getClass)
  set + 3
  val hs1:HashSet[Char] = HashSet('1', '2')
  val hs2:HashSet[Char] = HashSet('2', '3')
  println(hs1 | hs2)
  println(hs1 & hs2)
  println(hs1 &~ hs2)
  println(hs2 &~ hs1)
  /**
   * map and flatMap
   */
  val names = List("Peter", "Paul", "Mary")
  val n = names.flatMap(_.toUpperCase)
  println(n)
  /**
   * zip
   */
  val prices = List(10.0, 20.0, 30.0)
  val quantity = List(2, 3, 4)
  val zip = prices zip quantity
  println(zip)
  val genPrices = zip.map(p => p._1 * p._2)
  //
  zip map {p => p._1 * p._2}
  //
  println("General prices: " + genPrices)
  val sum:Double = (prices zip quantity) map {p => p._1 * p._2} sum;
  println("Sum: " + sum)
  /**
   * Streams
   */
  private val from: Stream[BigInt] = numbersFrom(10)
  println(from)
  println(from.tail)
  println(from.take(5).force)
  //
  private val words: Stream[String] = Source.fromFile("a").getLines().toStream
  println(words.length)
  println(words.force)
  /**
   * Views
   */
  private val view = (0 until 1000).view.map(pow(2, _))
  println(view(10))
}
