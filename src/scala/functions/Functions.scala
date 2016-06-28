package scala.functions

/**
 * Created on 07.05.16.
 * @author evgen
 */
class Functions {}

object Functions {

  def twoTimes(n:Double):Double={
    2 * n
  }

  def mulBy(factor:Double) = (x:Double) => factor * x

  def twoTimes(f:Double => Double, v:Double) = f(v)
}
