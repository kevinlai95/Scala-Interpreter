package Expression
import UI._
import Value._

/**
 * @author xdark_000
 */
case class Block(blocks: List[Expression]) extends SpecialForm {
   def execute(env: Environment) = {
	   var tempEnv: Environment = new Environment(env)
	   blocks.map( _.execute(tempEnv) ).last
   }
}