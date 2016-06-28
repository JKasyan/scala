package scala

import java.io.IOException

import scala.annotation.{switch, tailrec, varargs}
import scala.io.Source

/**
 * Created on 24.05.16.
 * @author evgen
 */
package object annotations {

  def pow(i:Double) = (x:Double) => Math.pow(i, x)

  def func(a:Double, b:Double, c:Double) = (x:Int) => a * x * x + b * x + c

  @throws(classOf[IOException]) def readRows(path:String){
    Source.fromFile(path).iter
  }

  @varargs def classOfVarArgs[T](t: T*) {
    println(t.getClass)
  }

  def sumSeq(seq: Seq[Int]):BigInt = if(seq.isEmpty) 0 else seq.head + sumSeq(seq.tail)

  @tailrec def sumSeq(seq: Seq[Int], partial:Int):BigInt =
    if(seq.isEmpty) partial else sumSeq(seq.tail, seq.head + partial)

  def switchAnnotation(n:Int):String={
    (n: @switch) match {
      case 0 => "Zero"
      case 1 => "One"
      case _ => "?"
    }
  }

  def matchWithoutSwitch(n:Int):String={
    n match {
      case 0 => "Zero"
      case 1 => "One"
      case _ => "?"
    }
  }

  def allDifferent[@specialized(Int) T](x: T, y:T, z:T) = x != y && x != z && y != z
}
