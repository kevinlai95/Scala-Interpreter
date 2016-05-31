package UI

import scala.util.parsing.combinator._
/**
 * @author xdark_000
 */
class TypeException(val value:String = null,val result: Parsers#Failure = null) extends JediException("Syntax error"){
  val msg = ("Incompatible type must be of type: " + value)
}