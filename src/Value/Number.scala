package Value
import Expression._

case class Number(init: Double) extends Literal {
	var value: Double = init
	def this(init: String) = this(init.toDouble)
	def +(other: Number) = new Number(value+other.value)
	def -(other: Number) = new Number(value-other.value)
	def *(other: Number) = new Number(value*other.value)
	def /(other: Number) = new Number(value/other.value)
	def ==(other: Number) = new Boole(value == other.value)
	def <(other: Number) = new Boole(value < other.value)
	def >(other: Number) = new Boole(value > other.value)
	def <=(other: Number) = new Boole(value <= other.value)
	def >=(other: Number) = new Boole(value >= other.value)
	
	override def toString() = value.toString
	
	override def execute(env: Environment) = this
}
