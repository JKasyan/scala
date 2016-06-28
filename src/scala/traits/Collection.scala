package scala.traits

/**
 * Created on 02.05.16.
 * @author evgen
 */
trait Collection[T] {

  def add(t:T)

}

trait Set[T] extends Collection[T] {

  abstract override def add(t:T):Unit = {
    super.add(t)
  }
}
