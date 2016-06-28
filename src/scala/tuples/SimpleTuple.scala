package scala.tuples

/**
 * Created on 12.04.16.
 * @author evgen
 */
object SimpleTuple {

  def main(args: Array[String]): Unit = {
    val t:(Int, Double, String) = (1, 3.14, "Alice")
    println(t._2)
    println(t _3)
    val (first, second, _) = t
    println(first + ", "  + second + ", ")
    /**
     *
     */
    val partition: (String, String) = "New York".partition(_.isUpper)
    println(partition.getClass)
    println(partition)
  }
}
