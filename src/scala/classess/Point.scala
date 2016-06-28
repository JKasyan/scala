package scala.classess

/**
 * Created on 20.04.16.
 * @author Kasyan Evgen
 */
class Point(private val x:Int, private val y:Int) {

  def inc(dx:Int, dy:Int):Point = new Point(this.x + dx, this.y + dy)

  def dec(dx:Int, dy:Int):Point = new Point(this.x - dx, this.y - dy)

  def distance(dx:Int, dy:Int):Double = Math.sqrt((x - dx) * (x - dx) + (y - dy) * (y - dy))

  override def toString = "Point{x=" + x + ", y=" + y + "}"

}
