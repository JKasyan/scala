package scala.inheritance

/**
 * Created on 26.04.16.
 * @author evgen
 */
object Main {

  def main(args: Array[String]) {
    val person:Person = new Manager("John", 29)
    println(person.getClass)
    /**
     *
     */
    val manager: Manager = person.asInstanceOf[Manager]
    println(manager)
    if(person.isInstanceOf[Manager] && person.getClass == classOf[Manager]) {
      println(person.isInstanceOf[Manager])
    }
    println(classOf[Person])
    println(person.getClass)
    /**
     *
     */
    val digit:Int = 5
    println("Before: " + digit.getClass)
    val digitLong = digit.asInstanceOf[Long]
    println("After: " + digitLong.getClass)

    /**
     *
     */
    val bird:Animal = new Bird("Bird")
    println(bird)
    val gadget:Gadget = new Phone(100)
    println(gadget.id)

    /**
     * Anonymous classes
     */
    val d:Int = 100
    val anonymousObject:AnonymousClass = new AnonymousClass(d) {
      override def toString = "Number: " + d
    }
    println(anonymousObject)
    val user:User = new User("John", 1000)
    //user.setFirstName("123")
    println(user.firstName)

    /**
     *
     */
    val creature:Creature = new Ant
    val length:Int = creature.env.length
    println(length)
    val a:A = new B
    println(a.a.length)

    /**
     *
     */
    val itemOne:Item = new Item("Phone", 200)
    val itemTwo:Item = new Item("Phone", 200)
    println(itemOne.equals(itemTwo))
    println(itemOne == itemTwo)
  }

}
