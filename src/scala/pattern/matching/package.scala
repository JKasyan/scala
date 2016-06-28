package scala.pattern

/**
 * Created on 16.05.16.
 * @author evgen
 */
package object matching {

  def toInt(x:AnyVal):Int = {
    x match {
      case i:Int     => i
      case d:Double  => d.toInt
      case c:Char    => Character.digit(c, 10)
      case _         => 0
    }
  }

  def arrayMatch[A](arr:Array[A]):String={
    arr match {
      case Array(0)     => "0"
      case Array(x, y)  => x + " " + y
      case Array(0, _*) => "0..."
      case _            => "something else"
    }
  }

  def printMap[K, V](map:Map[K, V]): Unit = {
    for((k, v) <- map) println(k + " " + v)
  }

  def defineAmount(amount:Amount): String ={
    amount match {
      case Dollar(v)                        => "$" + v
      case _ Currency s                     => "On noes, I got " + s
      case Nothing                          => ""
    }
  }

  def defineItem(item:Item) {
    item match {
      case Bundle(_, _, Article(desc, _), rest)           =>
      case Bundle(_, _, Article(desc, _), _*)             =>
      case Bundle(_, _, art @ Article(_, _), rest @ _*)   =>
    }
  }

  def price(item:Item):Double = {
    item match {
      case Article(_, p)   => p
      case Bundle(_, disc, articles @ _*) => articles.map(price).sum - disc
    }
  }

  def color(trafficColor: TrafficColor):String={
    trafficColor match {
      case Red    => "stop"
      case Yellow => "hurry up!"
      case Green  => "go"
    }
  }

  def option[T](t:T) = Some(t)

  val f:PartialFunction[Char, Int] = {
    case '+'  => 1
    case '-'  => -1
  }
}
