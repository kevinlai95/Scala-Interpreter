package Expression
import Value._
/**
 * @author xdark_000
 */ 
trait Literal extends Expression with Value{
  def execute(env:Environment) = this
}
//is an expression and value
//value to return this and expression to implement execute