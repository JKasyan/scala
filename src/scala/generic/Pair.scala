package scala.generic

/**
 * Created on 29.05.16.
 * @author evgen
 */
class Pair[T <: Comparable[T]](val f:T, val s:T) {

  def smaller = if(f.compareTo(s) < 0) f else s

  def replaceFirst[R >: T](first:R) = Pair(first, s)
}

object Pair {

  def apply[T](f:T, s:T) = new Pair(f, s)
}
