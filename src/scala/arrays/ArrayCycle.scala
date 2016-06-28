package scala.arrays

/**
 * Created 09.04.16.
 *
 */
object ArrayCycle {

  def main (args: Array[String]) {
    val a:Array[Int] = Array(1, 2)
    cycleOne(a)
    val c = 0 until 10
    println(c.getClass)
    val d:Array[Double] = Array(1, 2, 3, 4, 5, 6)
    println("Odd cycle")
    oddCycle(ar = d)
    println("Reverse cycle")
    reverseCycle(d)
    println("Immediately cycle")
    immediatelyCycle(d)
  }

  private def cycleOne[T](ar:Array[T]): Unit = {
    for(i <- 0 until ar.length) println(i + " - " + ar(i))
  }

  private def oddCycle[T](ar:Array[T]) :Unit = {
    for( i <- 0.until(ar.length, 2)) println(i + " - " + ar(i))
  }

  private def reverseCycle[T](ar:Array[T]) :Unit = {
    for(i <- 0.until(ar.length).reverse) println(i + " - " + ar(i))
  }

  private def immediatelyCycle[T](ar:Array[T]) : Unit = {
    for(el <- ar) println(el)
  }
}
