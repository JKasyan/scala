package scala

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * Created on 11.05.16.
 * @author evgen
 */
package object collections {

  def until(cond: => Boolean)(function: => Unit): Unit = {
    if(!cond) {
      function
      until(cond)(function)
    }
  }

  def sumList(list: List[Int]):Int = {
    if(list == Nil) 0 else list.head + sumList(list.tail)
  }

  def sumListCase(list: List[Double]):Double = {
    list match {
      case Nil => 0
      case h :: t => h + sumListCase(t)
    }
  }

  def takeFromList[A](list: List[A], n:Int):List[A] = {
    var b = new ListBuffer[A]
    var i = 0
    var these = list
    while(list.nonEmpty && i < n) {
      i += 1
      b += these.head
      these = these.tail
    }
    b.toList
  }

  def printTails[A](list: List[A]):Unit={
    var t = list
    while (t.nonEmpty) {
      println(t)
      t = t.tail
    }
  }

  def replaceByCondition(linkedList: mutable.LinkedList[Int], f:Int => Boolean):Unit={
    var current = linkedList
    while (current != Nil) {
      if(f(current.elem)) current.elem = 0
      current = current.next
    }
  }

  def testAr(el:Int*): Unit = {
    println(el.getClass)
  }

  def numbersFrom(n:BigInt):Stream[BigInt] = n #:: numbersFrom(n + 1)

}
