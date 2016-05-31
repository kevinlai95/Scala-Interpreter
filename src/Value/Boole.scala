package Value
import Expression._
/**
 * @author xdark_000
 */
  case class Boole(value: Boolean) extends Literal{
    override def toString() = value.toString()
	  def this(stringInput: String)= this(stringInput.toBoolean)
}
//jedi class that wraps a scala boolean boolean does not know about value or expressions 
//number wraps the double class