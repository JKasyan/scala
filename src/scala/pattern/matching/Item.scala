package scala.pattern.matching

/**
 * Created on 23.05.16.
 * @author evgen
 */
sealed abstract class Item

case class Article(description:String, price:Double) extends Item

case class Bundle(description:String, discount:Double, items:Item*) extends Item
