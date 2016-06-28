package scala.classess

/**
 * Created on 17.04.16.
 * @author evgen
 */
object Main {

  def main(args: Array[String]) {
    val user:User = new User(30)
    user.setFirstName("John")
    println(user.getFirstName)
    /**
     * User with 3 constructors
     */
    val user1:User = new User(20)
    val user2:User = new User(20, "Adam")
    val user3:User = new User(20, "Adam", "Smith")
    /**
     *
     */
    val point:Point = new Point(10, 20)
    println(point)
    println(point.inc(1, 2))
    println(point.dec(1, 1))
    println(point.distance(14, 12))
  }
}
