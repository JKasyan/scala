package scala.maps

/**
 * Created by evgen on 11.04.16.
 */
object IterationMap {

  def main(args: Array[String]) {
    val map = Map("One" -> 1, "Two" -> 2, "Three" -> 3)
    iteration1(map)
    keyIteration(map)
    valueIteration(map)
    iteration1(mapInversion(map))
  }

  def iteration1[K, V](map: Map[K, V]): Unit = {
    for ((k, v) <- map) println(k.+(" - ").+(v))
  }

  def keyIteration[K, V](map: Map[K, V]): Unit = for (el <- map.keySet) println(el)

  def valueIteration[K, V](map: Map[K, V]): Unit = for (el <- map.values) println(el)

  def mapInversion[K, V](map: Map[K, V]): Map[V, K] = for((k, v) <- map) yield (v, k)
}
