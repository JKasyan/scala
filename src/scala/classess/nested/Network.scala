package scala.classess.nested

import scala.collection.mutable.ArrayBuffer

/**
 * Created on 20.04.16.
 * @author evgen
 */
class Network {

  class Member(val name: String) {
    val members = new ArrayBuffer[Member]()
  }

  private val members = new ArrayBuffer[Member]()

  def join(name:String):Member = {
    val member = new Member(name)
    members += member
    member
  }

}
