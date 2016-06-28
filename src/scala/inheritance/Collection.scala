package scala.inheritance

/**
 * Created on 30.04.16.
 * @author evgen
 */
class Collection[T] extends List[T] {

  private var array:Array[Any] = new Array[Any](10)
  private var size:Int = 0
  private val lock:Object = new Object

  override def add(t: T): Unit = {
    lock.synchronized({
      array(size) = t
      size += 1
    })
  }

  private def checkSize():Boolean = {
    array.length >= size
  }

  override def get(i: Int): Unit = {

  }
}

trait List[T] {

  def add(t:T)
  def get(i:Int)
}
