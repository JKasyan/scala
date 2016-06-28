package scala.pattern.matching

import scala.collection.JavaConversions._

/**
 * Created on 16.05.16.
 * @author evgen
 */
object App {

  def main(args: Array[String]) {
    val ch:Char = '+'
    var res:Int = 0
    res = ch match {
      case '+' =>  1
      case '-' => -1
      case _ if Character.isDigit(ch) => Character.digit(ch, 10)
      case _ =>  0
    }
    /**
     *
     */
    val a:Double = 123.02
    val i = toInt(a)
    println(i)
    val c:Char = '&'
    println(toInt(c))
    /**
     *
     */
    val arr:Array[Int] = Array(1, 2)
    val arrayResult:String = arrayMatch(arr)
    println(arrayResult)
    /**
     *
     */
    val (q, r) = BigInt(10) /% 3
    println(q + " " + r)
    /**
     *
     */
    Runtime.getRuntime
    System.getSecurityManager
    /**
     *
     */
    val map:Map[String, Int] = Map("One".->(1), "Two" -> 2)
    printMap(map)
    for((k, v) <- System.getProperties) println(k + " " + v)
    /**
     *
     */
    println("###############  Case class   ###############")
    val amounts = Array(Dollar(20.0), Currency(25.0, "UA"), Nothing)
    amounts.map(defineAmount(_)).foreach(println)
    amounts map {_ hashCode} foreach println
    val Currency(x, y) = amounts(1)
    println(x + ", " + y)
    /**
     *
     */
    val items:Array[Item] = Array(Article("Notebook", 500.0),
      Bundle("", 200.0, Article("iPhone 6", 1000.0), Article("Lenovo", 200.0)))
    val pr = items.map(price).sum
    println(pr)
    /**
     *
     */
    val s = option("Hello")
    println(s)
    val opt = MyOption(1)
    val optString:String = opt match {
      case Some(z)   => z.toString
      case Null      => ""
    }
    println(optString)
    /**
     *
     */
    val char:Char = '+'
    if(f.isDefinedAt(char)) {
      println(f(char))
    }
  }
}
