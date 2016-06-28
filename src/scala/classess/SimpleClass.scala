package scala.classess

/**
 * Created on 16.04.16.
 * @author evgen
 */
class SimpleClass {

}

class Counter {

  private var value = 0

  def increment() : Unit = {value += 1}

  def current:Int = value
}

object SimpleClass {

  def main(args: Array[String]) {
    val counter:Counter = new Counter
    counter.increment()
    println(counter.current)
  }
}
