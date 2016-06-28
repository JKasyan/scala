package scala.annotations

/**
 * Created on 24.05.16.
 * @author evgen
 */
object App {

  def main(args: Array[String]) {
    val fun: (Double) => Double = pow(2.0)
    for( el <- 1 to 10) println(fun(el))
    val parabola: (Int) => Double = func(1.0, 0, 0)
    for(el <- 1 to  10) println(parabola(el))
    classOfVarArgs(1, 2, 3)
    /**
     *
     */
    val sum:BigInt = sumSeq(1 to 1000000, 0)
    println(sum)

    /**
     *
     */
    val res:Boolean = allDifferent('1', '1', '1')
    println(res)
  }
}
