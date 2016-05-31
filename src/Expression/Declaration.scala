package Expression
import Value._
/**
 * @author xdark_000
 */
case class Declaration(id:Identifier, exp:Expression) extends SpecialForm{
  def execute(env:Environment):Value = {
    val a = exp.execute(env)
    env.put(id, a)
    Notification.OK
   
  }
}