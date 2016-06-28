package scala.pattern.matching

/**
 * Created on 23.05.16.
 * @author evgen
 */
abstract class Amount

case class Dollar(value:Double) extends Amount

case class Currency(value:Double, unit:String) extends Amount

case object Nothing extends Amount
