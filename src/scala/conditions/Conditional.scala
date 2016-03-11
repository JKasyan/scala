package scala.conditions

import java.util.Date

/**
 * Created by evgen on 06.03.16.
 */
class Conditional {
}

object Conditional {

  def main(args: Array[String]) {
    val x:Int = -5
    val s = if(x > 0) "Hello" else new Date()
    println(s)
    /**
     *
     */
    val c:Any = if(x < 5) () else "ddd"
    println(c.getClass)
    val f:Object = if(x > 5) new Integer(20) else Long
    System.out.println(f)
    /**
     *
     */
    val distance = {val dx = x - 2; val dy = x - 5; dx + dy}
    println(distance)
  }
}
