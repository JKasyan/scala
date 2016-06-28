package scala

/**
 * Created on 29.05.16.
 * @author evgen
 */
package object generic {

  def smaller[T <: Comparable[T]](f:T, s:T):T=if(f.compareTo(s) < 0) f else s

  def pow(a:Double) = (x:Double) => Math.pow(a, x)

}
