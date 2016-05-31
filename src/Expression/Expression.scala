package Expression
import Value._
/**
 * @author xdark_000
 */
trait Expression {
  def execute(env:Environment):Value
}