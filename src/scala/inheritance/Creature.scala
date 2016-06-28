package scala.inheritance

/**
 * Created on 30.04.16.
 * @author evgen
 */
class Creature {
  val  range:Int = 10
  val env:Array[Int] = new Array[Int](range)
}

class Ant extends {override val range = 2} with Creature {
  //override val range = 2
}
