package scala.collections

/**
 * Created on 14.05.16.
 * @author evgen
 */
class Buffer[A] {

  private var start:List[A] = Nil
  private var last0: ::[A] = _
  private var len = 0

  def +=(el:A):this.type = {
    if(start.isEmpty) {
      last0 = new ::(el, Nil)
      start = last0
    } else {
      val l1 = last0
      last0 = new ::(el, Nil)
      //l1.tail = last0
    }
    len += 1
    this
  }
}

