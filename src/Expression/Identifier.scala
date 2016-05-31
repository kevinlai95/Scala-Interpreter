package Expression
import Value._
import UI._
/**
 * @author xdark_000
 */
case class Identifier (value:String) extends Expression with Serializable{
  
  def execute(env: Environment) = {
    if (env.contains(this)) env(this) else throw new UndefinedException(value)
  }
  

}
//create our own undefineded functoin4 == 
//generate companion, tostring, constructors, destrucotors, 