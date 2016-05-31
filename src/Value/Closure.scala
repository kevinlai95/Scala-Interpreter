package Value
import UI._
import Expression._
/**
 * @author xdark_000
 */
case class Closure(params: List[Identifier], body: Expression, defEnv: Environment) extends Value {
   def apply(args: List[Value]): Value = 
   {
    if(params.length != args.length) throw new TypeException("Length mistmatch")
    var tempEnv : Environment = new Environment(defEnv)
    
    tempEnv.put(params, args)
    
    body.execute(tempEnv)
   }
   
   def execute(env: Environment): Value = 
   {
       Notification.UNSPECIFIED 
   }
}