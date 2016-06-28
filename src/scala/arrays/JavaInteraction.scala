package scala.arrays

import scala.collection.mutable.ArrayBuffer

/**
 * Created 10.04.16.
 */
object JavaInteraction {

  def main(array: Array[String]) : Unit = {
    val command = ArrayBuffer("ls", "-al", "/home/evgen")
    //val pb = new ProcessBuilder(command)
    //val cmd:ArrayBuffer[String] = pb.command()
  }
}
