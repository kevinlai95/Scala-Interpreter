package Value
import Expression._
//import collection.immutable.HashMap
//import java.util.HashMap
import scala.collection.mutable.HashMap
import UI._
/**
 * @author xdark_000
 */
class Environment(prev: Environment = null) extends HashMap[Identifier, Value] with Value {
  var nextEnvironment: Environment = prev
  
  def put(ids: List[Identifier], vals: List[Value])
  {
    var pairs: List[(Identifier, Value)] = ids.zip(vals)
    pairs.map(x => super.put(x._1, x._2))
  }
  
  def find(id: Identifier): Value = 
  {
    var res: Option[Value] = super.get(id)
    res match
    {
      case Some(x) => { x }
      case None =>
      {
        if(prev == null) Notification.UNSPECIFIED 
        else prev.find(id)
      }
    }
  }
  def execute(env: Environment): Value = Notification.UNSPECIFIED 
}
  