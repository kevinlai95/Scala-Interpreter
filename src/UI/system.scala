package UI
import Value._

object system {
  
  // the dispatcher
  def execute(operator: String, args: List[Value]) = {
    operator match {
      case "add" => add(args)
      case "sub" => sub(args)
      case "mul" => mul(args)
      case "div" => div(args)
      case "less" => less(args)
      case "equals" => equals(args)
      case _ => throw new UndefinedException(operator)
    }
  }
  def add(args: List[Value]) = {
    // type check like crazy first
    new Number(args.map(_.asInstanceOf[Number]).map(_.value).reduce (_ + _))
  }
  
  def sub(args: List[Value]) = {
    new Number(args.map(_.asInstanceOf[Number]).map(_.value).reduce (_ - _))
  }
  
  def mul(args: List[Value]) = {
    new Number(args.map(_.asInstanceOf[Number]).map(_.value).reduce (_ * _))
  }
  
  def div(args: List[Value]) = {
    new Number(args.map(_.asInstanceOf[Number]).map(_.value).reduce (_ / _))
  }
  
  def less(values: List[Value]) = {
    var ans = true
    var length = values.length -1
    if(values.length > 1){
      for(i <- 0 until length){
        if(values(i).asInstanceOf[Number].value > values(i + 1).asInstanceOf[Number].value)ans = false 
        length = length-1
      }
    }
    new Boole(ans)
  }
  
  def equals(values: List[Value]) = {
    var ans = true
    var length = values.length -1
    if(values.length > 1){
      for(i <- 0 until length){
        if(!values(i).asInstanceOf[Number].value.equals(values(i + 1).asInstanceOf[Number].value))ans = false
        length = length-1
      }
    }
    new Boole(ans)
  }
}
  
  

 