package scala.tuples

/**
 * Created on 15.04.16.
 * @author evgen
 */
object Zip {

  def main(array: Array[String]): Unit = {
    val a1 = Array("<", "=", ">")
    val a2 = Array(1, 2, 3)
    val a3 = a1.zip(a2)
    for (el <- a3) println(el)
  }
}
