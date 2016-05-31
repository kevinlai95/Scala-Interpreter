package Expression
import UI._
import Value._
/**
 * @author xdark_000
 */
case class Lambda(parameters: List[Identifier], exp: Expression) extends SpecialForm{
  
  def execute(env: Environment): Closure = 
  {
    Closure(parameters, exp, env)
  }

}