package scala.pattern.matching

/**
 * Created on 23.05.16.
 * @author evgen
 */

sealed abstract class MyOption[+T] {

  def get:T

  def isEmpty:Boolean
}

object MyOption {

  def apply[T](x: T): MyOption[T] = {
    if(x == null) Null else Some(x)
  }
}

case class Some[+T](t:T) extends MyOption[T] {
  def get = t
  def isEmpty = false
}

case object Null extends MyOption[Nothing] {
  def get = throw new RuntimeException
  def isEmpty = true
}