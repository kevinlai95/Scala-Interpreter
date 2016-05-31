package Expression
import Value._
import UI._

case class FunCall(operator: Identifier, operands: List[Expression] = Nil) extends Expression {
  
  def execute(env: Environment):Value = {
    val args: List[Value] = operands.map(_.execute(env)) // eagerly execute operands
    if (env.contains(operator)) {
      //check if it is a closure then apply a close
      var result = operator.execute(env)
      if(!result.isInstanceOf[Closure]) throw new TypeException("No closure found")
      result.asInstanceOf[Closure](args)
    } else {
      system.execute(operator.value, args)
    }  
  }
  
}
