package scala.objects

/**
 * Created on 21.04.16.
 * @author evgen
 */
object Main {

  def main(args: Array[String]) {
    val clazz: Class[_] = Account.getClass
    println(clazz)
    val accounts:Array[Account] = new Array[Account](1000000)
    var i:Int = 0
    for(el <- accounts) {
      accounts(i) = Account.apply()
      i += 1
    }
    val acc:Account = accounts(5)
    println(acc)
    println("Length: " + Account)
    /**
     * apply
     */
    Array("One", "Two")
    val point: Point = Point(1, 2)
    println(point hashCode)

    /**
     * enums
     */
    val blue: Color.Value = Color.BLUE
    println(blue.getClass)
    for(color <- Color values) println(color.id + " " + color)
    val c:Color.Value = Color(0)
    println(c)
    val col = Color.withName("RED")
    println(col)
  }
}
