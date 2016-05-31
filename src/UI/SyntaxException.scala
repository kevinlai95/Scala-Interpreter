package UI
import scala.util.parsing.combinator._

/**
 * @author xdark_000
 */
class SyntaxException(val result: Parsers#Failure = null) extends JediException("Syntax error"){
  val msg = "Syntax Error"
}


