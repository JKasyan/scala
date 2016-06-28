package scala.traits

/**
 * Created on 03.05.16.
 * @author evgen
 */
trait LoggedException extends Exception with Logged {

  def log(): Unit = {
    log(getMessage)
  }

}

class UnhappyException extends LoggedException {

  override def getMessage = "arggh!"

}
