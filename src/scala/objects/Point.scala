package scala.objects

/**
 * Created on 21.04.16.
 * @author Kasyan Evgen
 */
class Point private (private val x:Double, private val y:Double) {

  override def toString = "(" + x + ", " + y + ")"

}

object Point {
  def apply(x:Double, y:Double) = new Point(x, y)
}