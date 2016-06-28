package scala.collections

/**
 * Created on 14.05.16.
 * @author evgen
 */
class ArrayList[A](protected val capacity:Int) extends Iterable[A] {

  def this() {
    this(10)
  }

  private var elements:Array[AnyRef] = new Array[AnyRef](capacity)
  private var len = 0

  def +=(el:A) : Unit = {
    ensureCapacity()
    elements(len) = el.asInstanceOf[AnyRef]
    len += 1
  }

  override def iterator: Iterator[A] = new IteratorImpl[A]

  private class IteratorImpl[A](var cursor:Int = this.len) extends Iterator[A] {

    override def hasNext: Boolean = cursor != this.length

    override def next(): A = {
      elements(cursor).asInstanceOf[A]
    }
  }

  private def ensureCapacity() {
    if(elements.length < len + 1 ) {
      val newAr:Array[AnyRef] = new Array[AnyRef](len * 2)
      Array.copy(elements, 0, newAr, 0, len)
      elements = newAr
    }
  }

  override def head:A = elements(0).asInstanceOf[A]

  override def last:A = elements(len - 1).asInstanceOf[A]

//  override def length():Int = len

  override def isEmpty: Boolean = len == 0

  override def foreach[U](f: (A) => U): Unit = {
    for(el <- elements) f(el.asInstanceOf[A])
  }


  override def toString() = {
    val sb:StringBuilder = new StringBuilder
    sb.append("ArrayList(")
    for(el <- 0 until len) sb.append(el.toString).append(", ")
    sb.append(")")
    sb.toString()
  }
}

object ArrayList {

  //def apply[A](elements:A*) = new ArrayList[A](elements)

  def update[A](n:Int, el:A): Unit = {

  }
}
