package scala.objects

/**
 * Created on 21.04.16.
 * @author evgen
 */
abstract class UndoableAction(val description:String) {

  def undo():Unit
  def redo():Unit

}

object DoNothingObject extends UndoableAction("DO nothing") {

  override def undo(): Unit = {}
  override def redo(): Unit = {}

}
