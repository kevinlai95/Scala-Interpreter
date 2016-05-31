package Expression
import Value._
import UI._
/**
 * @author xdark_000
 */
//represents expressions of the forms
//if (a) b else c
//if (a) b


case class Conditional(condition: Expression, consequent: Expression, alternative: Expression = null) extends SpecialForm {
   def execute(env: Environment) = {
     condition.execute(env) match {
       case Boole(value) => 
         if (value) consequent.execute(env) 
         else if (alternative != null) alternative.execute(env) else Notification.UNSPECIFIED
       case _ => throw new TypeException("if condition must be Boole")
     }
   }
}
