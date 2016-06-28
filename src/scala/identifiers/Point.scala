package scala.identifiers

final class Point private (private val x:Int, private val y:Int) {

  def +(p:Point):Point={
    Point(x + p.x, y + p.y)
  }

  def -(p:Point):Point={
    Point(x - p.x, y - p.y)
  }

  def *(p:Point):Point={
    Point(x * p.x, y * p.y)
  }

  override def toString = "Point{x=" + x + ", y=" + y + "}"

}

object Point {

  def apply(x:Int, y:Int):Point={
    new Point(x, y)
  }

  def unapply(p:Point):Option[(Int, Int)]={
    if(p == null) None else Some((p.x, p.y))
  }
}