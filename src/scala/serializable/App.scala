package scala.serializable

import java.io.{ObjectOutputStream, FileOutputStream}

/**
 * Created on 26.05.16.
 * @author evgen
 */
object App extends scala.App {
  val f:FileOutputStream = new FileOutputStream("test.txt")
  val o:ObjectOutputStream = new ObjectOutputStream(f)
  val user:User = new User(100L, "user")
  o.writeObject(user)
  o.flush()
  o.close()
}
