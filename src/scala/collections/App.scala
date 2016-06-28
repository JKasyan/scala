package scala.collections

import scala.collection.immutable.{HashMap, IndexedSeq => ImSeq, Vector}
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ArraySeq, ListBuffer, LinkedList}


/**
 * Created on 11.05.16.
 * @author evgen
 */
object App {

  def main(args: Array[String]) {
    val col:List[Int] = Array(1, 2, 3).toList
    val it: Iterator[Int] = col.iterator
    while (it.hasNext) {
      print(it.next() + " ")
    }
    println()
    /**
     *
     */
    val map:HashMap[String, Int] = HashMap("One" -> 1, "Two" -> 2)
    println("0".##)
    val vector:ImSeq[Int] = Vector(1, 2, 3)
    val ar:Array[_] = Array(1, 2, 3)
    /**
     * List
     */
    println("Immutable list")
    val digits:List[Int] = List(1, 2, 3, 4)
    println(digits.getClass)
    println("Head: " + digits.head + ", tail: " + digits.tail)
    println("Head of tail: " + digits.tail.head + ", tail of tail: " + digits.tail.tail)
    println("Sum digits: " + sumList(digits))
    val newDigits = List(-1, 0) ::: digits
    println(digits.:::(List(-1, 0)))
    println(newDigits)
    //val func = (x:Int) => x * 2
    println(newDigits.map(_ * 2))
    val plusPlus : List[Int] = digits.++(5 to 10)
    println("++ " + plusPlus)
    println("+: " + digits.+:(0))
    val taken:List[Int] = digits.take(2)
    println("Taken 2: " + taken)
    //
    printTails(List(1, 2, 3, 4, 5))
    //
    val l:List[Int] = List(1, 2).::(0)
    println("l: " + l)
    val listBuffer:ListBuffer[Int] = ListBuffer.empty
    listBuffer += 1
    listBuffer ++= List(2, 3)
    println(listBuffer)
    listBuffer.++=:(List(-1, 0))
    println(listBuffer)
    /**
     * Range
     */
    val range:Range = new Range(0, 10, 2)
    println(range)
    /**
     * ArrayBuffer
     */
    var arrayBuffer:ArrayBuffer[Int] = ArrayBuffer(0, 1, 2)
    arrayBuffer += 3 ++= Range(4, 7)
    arrayBuffer.+=(7).+=(8)
    println(arrayBuffer)
    /**
     * ArraySeq
     */
    val arraySeq:mutable.ArraySeq[Double] = mutable.ArraySeq(1.2, 1.3)
    arraySeq.update(0, 1.4)
    arraySeq(1) = 1.5
    try {
      arraySeq(2) = 0.0
    } catch {
      case e: IndexOutOfBoundsException => println("Out of bounds")
    }
    println(arraySeq)
    /**
     * mutable.LinkedList
     */
    val linkedList:mutable.LinkedList[Int] = mutable.LinkedList(1, -2, -3, 4)
    replaceByCondition(linkedList, _ > 0)
    linkedList.elem = 100
    println(linkedList.next)
    println(linkedList)
  }
}
