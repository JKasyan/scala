package scala

/**
 * Created on 10.05.16.
 * @author evgen
 */
package object functions {

  def twoPowX(v:Double)=(x:Double) => Math.pow(x, v)

  def functionOfDigit(f:Double => Double, v:Double) = f(v)

  def valueAtOneQuarter(f:Double => Double) = functionOfDigit(f, 0.25)

  def filterList[A](list:List[A], f:A => Boolean):List[A]={
    list.filter(f)
  }

  def isGreaterThanZero(n:Int):Boolean = {
    n >= 0
  }

  def mulBy(v:Int) = (x:Double) => {
    val cl = v
    x * cl
  }

  def mulOneAtTime(x:Int)(y:Int) = x * y

  def filterListCurry[A](list: List[A])(p:A => Boolean): Unit = {
    list.filter(p)
  }

  def modN(x:Int, y:Int) = (x % y) == 0

  def funWithoutParams(f: () => Unit) = f()

  def runInThread(f:()=>Unit): Unit = {
    new Thread{
      override def run() = f()
    }.start()
  }

  def until(condition: => Boolean)(block: => Unit): Unit = {
    if(!condition) {
      block
      until(condition)(block)
    }
  }

  def indexOf(str:String, ch:Char):Int={
    var i = 0
    until(i == str.length) {
      if (str(i) == ch) return i
      i += 1
    }
    -1
  }


}
